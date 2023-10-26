package Auto;

public class Car {
    private String engine;
    private String transmission;

    public Car(String engine, String transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    // Методы set и get для установки значений переменных
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    //метод toString
    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }

    //метод equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return engine.equals(car.engine);
    }

    public static void main(String[] args) {
        Car car1 = new Car("v8", "automatic");
        Car car2 = new Car("v6", "manual");

        System.out.println(car1);
        System.out.println(car2);

        if (car1.equals(car2)) {
            System.out.println("Совпадает.");
        } else {
            System.out.println("Не совпадает.");
        }
    }
}

