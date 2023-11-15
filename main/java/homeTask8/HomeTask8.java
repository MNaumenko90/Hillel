package homeTask8;

class HomeTask8 {
    public static void main(String [] args){
        //*1e*//
        A.B variable = new A.B();
        //*2e*//
        Time currentTime = Time.LUNCH;
        if (currentTime.getMessage() != null){
            System.out.println(currentTime.getMessage() + " - 2e задание");
        }
//        switch (currentTime) {
//            case LUNCH:
//                System.out.println(currentTime.getMessage() + " - 2e задание");;
//                break;
//        }
        //*3e*//
        System.out.println(Calc.MUL.action(10,6) + " - 3e задание");
    }
}

class A {
    static class B {
        public B() {
        System.out.println("Объект класса B - 1e задание");
        }
    }
}

