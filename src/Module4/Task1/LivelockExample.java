package Module4.Task1;

public class LivelockExample {
    static class Spoon {
        private Diner owner;

        public Spoon(Diner d) {
            owner = d;
        }

        public synchronized void use() {
            System.out.printf("%s использует ложку!%n", owner.name);
        }

        public synchronized void setOwner(Diner d) {
            owner = d;
        }
    }

    static class Diner {
        private String name;
        private boolean isHungry;

        public Diner(String n) {
            name = n;
            isHungry = true;
        }

        public void eatWith(Spoon spoon, Diner spouse) {
            while (isHungry) {
                if (spoon.owner != this) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        continue;
                    }
                    continue;
                }

                if (spouse.isHungry) {
                    System.out.printf("%s: дорогой %s, ты первый!%n", name, spouse.name);
                    spoon.setOwner(spouse);
                    continue;
                }

                spoon.use();
                isHungry = false;
                System.out.printf("%s: я наелся!%n", name);
                spoon.setOwner(spouse);
            }
        }
    }

    public static void main(String[] args) {
        final Diner husband = new Diner("Муж");
        final Diner wife = new Diner("Жена");

        final Spoon spoon = new Spoon(husband);

        Thread husbandThread = new Thread(() -> husband.eatWith(spoon, wife));
        Thread wifeThread = new Thread(() -> wife.eatWith(spoon, husband));

        husbandThread.start();
        wifeThread.start();
    }
}
