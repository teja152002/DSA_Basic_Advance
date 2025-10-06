package mypractice.oops;

/**
 * Method Overriding : the process of inheriting the method and changing the implementation of inherited method is called method overriding.
 */
class Dog{
    void eat(){
        System.out.println("Dog eats biscuits");
    }
}
class Cat extends Dog{
    @Override
    void eat(){
        super.eat(); // super is a keyword which is used to access super class members. It should be first line of code either in method or constructor
        System.out.println("Cat drinks milk");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}
