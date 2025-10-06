package mypractice.practice;

public class Employee {
    int empId;
    String empName;
    String empDept;

    Employee(int empId, String empName, String empDept){
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
    }

    @Override
    public String toString(){
        return this.empId + " " + this.empName + " " + this.empDept;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Bob", "CSE");
        Employee e2 = new Employee(102, "John", "ECE");
        Employee[] arr = {e1, e2};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].empId + " " + arr[i].empName + " " + arr[i].empDept);
        }

        // We can override to String method.
        System.out.println("After Overriding toString method : ");
        for(Employee emp : arr) {
            System.out.println(emp);
        }
    }
}
