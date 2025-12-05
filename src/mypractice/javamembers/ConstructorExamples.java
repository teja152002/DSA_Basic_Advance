package mypractice.javamembers;

public class ConstructorExamples {
    int id;
    String color;
    ConstructorExamples(int id, String color) {
        System.out.println("I am inside parameterized constructor");
        this.id = id;
        this.color = color;
        System.out.println(id +" : "+color);
    }
    ConstructorExamples(String name){
        System.out.println("I am inside parameterized constructor, and my name is " + name);
    }
    public static void main(String[] args) {
        ConstructorExamples ce = new ConstructorExamples(12, "blue");
        new ConstructorExamples("Bubbluu");
    }
}
