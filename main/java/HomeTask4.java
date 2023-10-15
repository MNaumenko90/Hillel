public class HomeTask4 {
    public static void main(String[] args) {
        // Вызов метода для вывода символов Unicode
//        UniChars();
        // Вызов Калькулятора
//        System.out.println(getDiv(1,2));
        // Вызов метода куб числа
//        System.out.println(getPow(3,3));
        // Вызов метода с разнымы типами данных
        System.out.println(getFunction(7.1));
    }

    public static void UniChars() {
        String uniStrOne = "&#x2460";
        String uniStrTwo = "&#x2461";
        String uniStrThree = "&#x2462";
        char symbol = (char) Integer.parseInt(uniStrOne.substring(3), 16);
        char symbol2 = (char) Integer.parseInt(uniStrTwo.substring(3), 16);
        char symbol3 = (char) Integer.parseInt(uniStrThree.substring(3), 16);
        System.out.println(symbol + " " + symbol2 + " " + symbol3);
    }



    public static int getSum(int a, int b) {
        return a + b;
    }
    public static int getSub(int a, int b) {
        return a - b;
    }
    public static int getMult(int a, int b) {
        return a * b;
    }
    public static int getDiv(int a, int b) {
        return a / b;
    }



    public static double getPow(int a, int b) {
        return Math.pow(a, b);
    }




    public static int getFunction(int a) {
        return a;
    }

    public static String getFunction(String a) {
        return a;
    }
    public static Boolean getFunction(Boolean a) {
        return a;
    }

    public static Double getFunction(Double a) {
        return a;
    }

    public static char getFunction(char a) {
        return a;
    }

    public static byte getFunction(byte a) {
        return a;
    }

}
