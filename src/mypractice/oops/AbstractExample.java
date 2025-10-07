package mypractice.oops;

abstract class HDFC{

    HDFC(){
        display();
    }
    abstract void withdraw();
    static void display(){
        System.out.println("Display method from HDFC abstract class");
    }
}
public class AbstractExample extends HDFC {


    AbstractExample(){
    }

    @Override
    void withdraw(){
        System.out.println("Withdraw method overriden from HDFC class");
    }

    public static void main(String[] args) {
        //display();
        AbstractExample ab = new AbstractExample();
        ab.withdraw();

    }
}
