package mypractice.oops;

class Student{
    void study(){
        System.out.println("Preparing for java !");
    }
    void study(int score){
        System.out.println("Qualified with : " + score);
    }
    void study(String grade){
        System.out.println("Grade : " + grade);
    }
}
class Teacher extends Student{
    @Override
    void study(){
        System.out.println("Explaining concepts to student !");
    }
}


public class PolymorphismExample {
    static void run(Student obj){
        obj.study();
    }
    public static void main(String[] args) {
        // Method Overloading - Compile time polymorphism
//        Student s = new Student();
//        s.study();
//        s.study(86);
//        s.study("A");

        // Method Overriding - Run time Polymorphism
//        Student s = new Teacher(); // Upcasting
//        s.study();
        run(new Teacher()); // upcasting using methods
    }
}
