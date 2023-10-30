package payments;

public class Main {
    public static void main(String[] args) {
        Bill bill1 = new Bill(1000);
        Person person1 = new Person("Billy", bill1);

        Bill bill2 = new Bill(0);
        Person person2 = new Person("Jonny", bill2);

        Service service = new Service();

        // Примеры операций
        service.replenishment(person1.getAccount(), 100);
        service.withdrawal(person2.getAccount(), 10);
        service.transaction(person1, person2, 50);

        System.out.println("Счет Billy: " + person1.getAccount().getAmount());
        System.out.println("Счет Jonny: " + person2.getAccount().getAmount());
    }
}
