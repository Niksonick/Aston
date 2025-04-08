package Module1.Task1;

public class Whale extends Mammal implements WaterHabitatable {

    public Whale(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Whale sound yyy");
    }


    @Override
    public void livesInWater() {
        System.out.println("Whale lives in water");
    }
}
