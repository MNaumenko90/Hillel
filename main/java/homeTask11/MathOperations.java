package homeTask11;

interface MathOperations {
    int calculate(int x, int y);
}

class LambdaExample {
    public static void main(String[] args) {
        // Лямбда для сложения
        MathOperations sum = (x, y) -> x + y;
        System.out.println("сложение " + sum.calculate(5, 3));

        // Лямбда для вычитания
        MathOperations sub = (x, y) -> x - y;
        System.out.println("вычитание " + sub.calculate(8, 3));

        // Лямбда для умножения
        MathOperations mult = (x, y) -> x * y;
        System.out.println("умножение " + mult.calculate(4, 5));

        // Лямбда для деления
        MathOperations div = (x, y) -> {
            if (y != 0) {
                return x / y;
            } else {
                return 0;
            }
        };
        System.out.println("деление " + div.calculate(10, 2));
    }
}
