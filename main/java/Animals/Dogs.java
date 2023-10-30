package Animals;


public class Dogs extends Animal {

    public Dogs(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("гав гав");
    }
    public void eat() {
        System.out.println("Собаки едят мясо");
    }
}
