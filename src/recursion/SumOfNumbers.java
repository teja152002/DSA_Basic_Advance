package recursion;

public class SumOfNumbers {
    public static int sum(int n, int s){
        if(n==0)
            return s;
        return sum(n-1,s+n);
    }

    public static int sumFun(int n){
        if(n<1){
            return 0;
        }
        return n+sumFun(n-1);
    }
    public static int factorial(int n){
        if(n<1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Sum of numbers using parameterized method : " + sum(100, 0));
        System.out.println("Sum of numbers using functional method : " + sumFun(5));
        System.out.println("Fatorial of given number using functional method : " + factorial(4));
    }
}
