package homeTask11;
import java.io.*;

class Cat implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

class SerializationToDo {

    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskas", 3, 15.5);
        serializeCat(myCat, "cat.ser");

        Cat deserializedCat = deserializeCat("cat.ser");
        System.out.println("Deserialized " + deserializedCat);
    }

    private static void serializeCat(Cat cat, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(cat);
            System.out.println("ready file with serialized cat");
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static Cat deserializeCat(String fileName) {
        Cat cat = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            cat = (Cat) ois.readObject();
            System.out.println("Cat deserialized from file");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException();
        }
        return cat;
    }
}
