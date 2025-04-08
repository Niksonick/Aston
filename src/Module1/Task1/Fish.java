package Module1.Task1;

public class Fish extends Animal implements WaterHabitatable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Fish sound bul-bul");
    }


    @Override
    public void livesInWater() {
        System.out.println("Fish lives in water");
    }
}
