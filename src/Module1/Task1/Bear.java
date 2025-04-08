package Module1.Task1;

public class Bear extends Mammal implements Furable {


    public Bear(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Bear sound aaaa");
    }

    @Override
    public void hasFur() {
        System.out.println("Bear has fur");
    }
}
