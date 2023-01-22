public class Animal {
    protected String name;
    protected String colour;

    @Override
    public String toString() {
        return name + " " + colour;
    }

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
}
