package mypractice.oops;

public class Encapsulation {
    private String name;
    private double salary;

    Encapsulation(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation("Boby", 245.7);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        e1.setName("Dude");
        e1.setSalary(879.95);
        System.out.println("After updating values using getters and setters : ");
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

    }
}
