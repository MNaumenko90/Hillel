package Animals;

public class Cats extends Animal {


    public Cats(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("мяу мяу");
    }

}
