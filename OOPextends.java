package OOP;

import level1Exam.Car;

class Vehicle {
    public String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return "This is a vehicle of brand" + this.brand;
    }

    public String getModle() {
        return "New modal";
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
}

class Motobike extends Vehicle {
    public Motobike(String brand) {
        super(brand);
    }

    @Override
    public String getBrand() {
        return "This is a motobike of brand" + this.brand;
    }

    public String isNew() {
        return "This is new bike";
    }
}

public class OOPextends {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        bmw.getBrand();
        bmw.getModle();

        Motobike bike = new Motobike("Suzuki");
        System.out.print(bike.getBrand());
    }

}
