package payments;

public class Person {
    private String name;
    private Bill account;

    public Person(String name, Bill account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Bill getAccount() {
        return account;
    }

    public void setAccount(Bill account) {
        this.account = account;
    }
}
