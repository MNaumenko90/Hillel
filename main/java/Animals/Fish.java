package Animals;

public class Fish extends Animal implements Swimmable{
    public Fish(String name, int age) {
        super(name,age); //конструкция super дает возможность использовать св-ва из род.класса
    }

    public boolean swim() {
        System.out.println("Рыба, плыви!");
        return true;
    }
    @Override
    void makeSound() {
        System.out.println("Рыбы молчат");
    }
}
