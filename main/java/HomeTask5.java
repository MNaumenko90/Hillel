import static java.lang.String.format;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class HomeTask5 {
    public static void main(String[] args) {
//        averageValue();
//        concat();
//        studentList();
//        isPalindrome("Madam' I'm Adam");
        String phoneNumber = "380637777777";
        System.out.println(isValidPhoneNumber(phoneNumber));
    }
    public static void concat() {
        String hello = "Hello";
        String world = " World";
        // оператор "+"
        String result1 = hello + world;
        // метод concat()
        String result2 = hello.concat(world);
        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hello).append(world);
        String result3 = stringBuilder.toString();

        System.out.println("+ " + result1);
        System.out.println("concat() " + result2);
        System.out.println("StringBuilder " + result3);
    }

    public static void averageValue() {
        String str = "Concatenation";
        int length = str.length();
        int middleIndex = length / 2;

        String averageValueOfStr = str.substring(middleIndex - 1, middleIndex + 1);

        System.out.println(averageValueOfStr);
    }

    public static void studentList() {
        String[] student1 = {"Vasiliy", "Vasiliew", "IT-Technologies"};
        String[] student2 = {"Ivan", "Ivanov", "IT-Technologies"};
        String[] student3 = {"Petr", "Petrov", "IT-Technologies"};
        System.out.println(format("My Name: %s, My Surname: %s, My Faculty: %s", student1[0],  student1[1],  student1[2]));
        System.out.println(format("My Name: %s, My Surname: %s, My Faculty: %s", student2[0],  student2[1],  student2[2]));
        System.out.println(format("My Name: %s, My Surname: %s, My Faculty: %s", student3[0],  student3[1],  student3[2]));
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");//удаляем все не нужное
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse(); //переворачиваем строку
        String invertedText = strBuilder.toString();//присваиваем перевернутую строку
        System.out.println(text.equalsIgnoreCase(invertedText));
        return text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\+\\d{12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }


}



