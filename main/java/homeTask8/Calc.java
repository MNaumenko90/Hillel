package homeTask8;

enum Calc {
    SUM {
        public int action (int a, int b) {
            return a + b;
        }
    },
    SUB {
        public int action (int a, int b) {
            return a - b;
        }
    },
    DIV {
        public int action(int a, int b) {
            return a / b;
        }
    },
    MUL {
        public int action(int a, int b) {
            return a * b;
        }
    },
    EXP {
        public int action(int a, int b) {
                return (int) Math.pow(a, b);
        }
    };

    public abstract int action (int a, int b);
}
