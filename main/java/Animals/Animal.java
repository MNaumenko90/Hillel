package Animals;

abstract class Animal {
    private String name; //приватные поля редактируемые с помощью get/set из вне
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

    void eat() {
        System.out.println("Все животные едят");
    }

    public String getName() {
        return this.name;
    }

    public int setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть больше 0");
        }
        return age;
    }
}

