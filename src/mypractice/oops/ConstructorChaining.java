package mypractice.oops;

class Car {
    Car(String name) {
        this("BMW", 675000.99);
        System.out.println("Name : " + name);
    }

    Car(String brand, double price) {
        this("V6", "Blue");
        System.out.println("Brand : " + brand + "Price : " + price);
    }

    Car(String model, String colour) {
        System.out.println("Model : " + model + "Color : " + colour);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Car c = new Car("OG");
    }
}
