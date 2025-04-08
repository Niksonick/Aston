package Module1.Task1;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public String getName() {
        return name;
    }
}
