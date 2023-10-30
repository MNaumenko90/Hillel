package Animals;

public class Main {
    public static void main(String [] args){

        Dogs dog = new Dogs("bobby", 2);
        Cats cat = new Cats("martin", 5);
        Fish fish = new Fish("nemo", 10);

        System.out.println(fish.setAge(0));

        C obj = new C();
        obj.display();
    }
}
class A {
    void display() {
        System.out.println("класс A");
    }
}
class B extends A {
    @Override
    void display() {
        super.display();
        System.out.println("класс B");
    }
}
class C extends B {
    @Override
    void display() {
        super.display();
        System.out.println("класс C");
    }
}
