package mypractice.javamembers;

abstract class AbstractMethodExample{
     public abstract void display();
}
public class MethodsExample extends AbstractMethodExample {

    @Override
    public void display(){
        System.out.println("Overriden display method present inside abstract class");
    }

    public static void run(){
        System.out.println("this is concrete method");
        new MethodsExample().display();

    }
    public static void main(String[] args) {
    run();
    }
}
