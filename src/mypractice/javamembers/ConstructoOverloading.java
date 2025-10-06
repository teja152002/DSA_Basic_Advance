package mypractice.javamembers;

// Constructor Overloading concept with the addittion opertion
public class ConstructoOverloading {
    ConstructoOverloading(){
        System.out.println("This program is for practicing the concept of constructor overloading with addittion operation");
    }
    ConstructoOverloading(int a, int b){
        System.out.println("Sum of two integers : " + (a+b));
    }
    ConstructoOverloading(double a, double b, double c){
        System.out.println("Sum of double values : " + (a+b+c));
    }

    public static void main(String[] args) {
        new ConstructoOverloading();
        new ConstructoOverloading(24, 48);
        new ConstructoOverloading(24.7, 32.9, 2.345);
    }
}
