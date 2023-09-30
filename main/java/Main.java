public class Main{
    public static void main(String [] args){
        // Примитивные типы данных
        int intVar = 32;
        float floatVar = 1.16f;
        double doubleVar = 7.41638;
        char charVar = 'С';  //вопрос:тип только для юникода,а текстовый тип какой?этот тип ограничен колличеством символов
        boolean booleanVar = true;
        byte byteVar = 99;
        short shortVar = 9999;
        long longVar = 1234567890;

        // Вывод значений переменных
        System.out.println("Целое число: " + intVar);
        System.out.println("Число с плавающей точкой (float): " + floatVar);
        System.out.println("Число с плавающей точкой (double): " + doubleVar);
        System.out.println("Символ: " + charVar);
        System.out.println("Логическое значение: " + booleanVar);
        System.out.println("Байт: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Long: " + longVar);

        // Операции над переменными разных типов
        int result1 = intVar + shortVar;
        double result2 = doubleVar + floatVar;
        long result3 = longVar + byteVar;

        // Вывод результатов
        System.out.println("Результат short + int: " + result1);
        System.out.println("Результат double + float: " + result2);
        System.out.println("Результат long + byte: " + result3);

        //Вывод и запуск отдельного метода SecondMain в main
        SecondMain(charVar,intVar);
    }
    public static void SecondMain(char a, int b){
        int result = a + b;
        System.out.println("Результат char + int: " + result);//не понятен результат 1089-при сложении символа 'C' и 32
    }
}