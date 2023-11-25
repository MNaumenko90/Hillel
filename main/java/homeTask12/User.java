package homeTask12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class User {
    private String name;
    private String surname;
    private int age;
    private String email;
    public User(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
class UserList {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Black", 25, "john.black@google.com"),
                new User("Jane", "Smith", 31, "jane.smith@google.com"),
                new User("Bob", "Piterson", 28, "bob.piterson@google.com"),
                new User("Janny", "Smitherson", 33, "janny.smitherson@google.com"),
                new User("Billy", "Doenko", 29, "billy.doenko@google.com")
        );
        try {
            String result = filterAndPrint(users);
            System.out.println("Результат " + result);
        } catch (NoResultException e) {
            System.out.println(e.getMessage());
        }
    }
    private static String filterAndPrint(List<User> users) throws NoResultException {
        return users.stream()
//                .filter(user -> user.getAge() > 25)
                .filter(user -> user.getSurname().length() > 8)
                .map(User::getName)
//                .distinct()
//                .collect(Collectors.toList());
                .findFirst()
                .orElseThrow(() -> new NoResultException("результата нет"));
    }
}
class NoResultException extends Exception {
    public NoResultException(String message) {
        super(message);
    }
}
