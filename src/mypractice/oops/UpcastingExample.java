package mypractice.oops;

class Parent{
    void work(){
        System.out.println("Parenting the child");
    }
}
class Child extends Parent{

//    @Override
//    void work(){
//        System.out.println("Childish behaviour");
//    }
    void display(){
        System.out.println("Method from child class");
    }
}
public class UpcastingExample{

    public static void main(String[] args) {
        Parent p = new Child(); // upcasting - super class reference storing of sub-class object
        p.work();
        // p.display(); -> it will give error, becuase only super class memebers accessible using upcasting concept
        // To access sub class members -> we must need to do downcasting - explicitly
        Child c = (Child) p;
        c.display();



    }
}
