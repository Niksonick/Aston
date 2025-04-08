package Module1.Task1;

public abstract class Mammal extends Animal implements Furable {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public void hasFur() {
        System.out.println("Mammal has fur");
    }
}
