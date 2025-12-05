package mypractice.oops;

interface Class_A{
    int a = 20; // by default, variable act as public static final in interface
    void display(); // by default, method act as public abstract
}
public class InterfaceExample implements Class_A {
    @Override
    public void display(){
        System.out.println("display method overriden from interface class");
    }

    public static void main(String[] args) {
        new InterfaceExample().display();
    }
}
