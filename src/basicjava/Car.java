package basicjava;

public class Car {
    String name;
    int price;

    Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    static void main(String[] args) {
        Car c = new Car("BMW", 1234);
        System.out.println(c.name + " - " + c.price);
    }
}
