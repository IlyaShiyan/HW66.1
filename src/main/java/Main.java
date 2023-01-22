public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik","Black");
        Conclusion conclusion = new Conclusion();
        conclusion.conclusion(cat);

        Dog dog = new Dog("Sharik", "Brown");
        conclusion.conclusion(dog);


    }
}
