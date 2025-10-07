package mypractice.oops;

/**
 * Abstraction : The process of hiding the unnecessary implementation adn showing only important functionality to the user, with help of interface or abstract
 */
interface Employee{
    void work();
}
class Business implements Employee{
    @Override
    public void work(){
        System.out.println("Building the tech fro business growth");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        Employee e = new Business();
        e.work();
    }
}
