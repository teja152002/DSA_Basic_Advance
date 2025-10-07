package mypractice.oops;

class Car {
//    Car(){
//        this("OG");
//    }
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

class ConstructorChaining extends Car{


//    ConstructorChaining(){
//        // Implicitly calls Super() class Constructor - becuase Zero parameterized constructor. If constructor is parametarized we need to call explicitly
//        System.out.println("Implicitly Calls Super Class Constructor Called Car() : ");
//    }
    ConstructorChaining(String name){
        super(name);
        System.out.println("Parent class constructor is parametarized. Hence we need to call explicitly.");
    }
    public static void main(String[] args) {
        new ConstructorChaining("OG");
    }
}
