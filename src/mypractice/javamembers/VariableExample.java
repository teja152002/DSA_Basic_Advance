package mypractice.javamembers;

public class VariableExample {
    String name = "Teja"; // Non-static varible, to use this we must need to create an object
    {
        System.out.println("I am a block , oustside of main method, declared in globally");
    }
    public static void main(String[] args) {
        VariableExample var = new VariableExample();
        int a = 10;
        System.out.println(a);
        System.out.println(var.name);
    }
    {
        System.out.println("I am second block, below of main method, declared in globnally");
    }
}
