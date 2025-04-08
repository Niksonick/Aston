package Module1.Task1;

public class Cat extends Mammal implements Furable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("cat sound meow");
    }

    @Override
    public void hasFur() {
        System.out.println("Cat has fur");
    }
}
