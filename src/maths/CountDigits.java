package maths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 123451234;
        int count = 0;
        while(n!=0){
            count ++;
            n = n/10;
        }
        System.out.println("Count of numbers using loop : "+count);

        int N = 12345;
        // Using log
        int countLog = (int)(Math.log10(N) + 1);
        System.out.println("Count of Numbers using log : "+countLog);
        int rev = 0;
        while(N!=0){
            int rem = N%10;
            rev = (rev*10) + rem;
            N = N/10;
        }
        System.out.println("Reverse of a number : " + rev);

        // To check given number is palindrome or not
        int num = 12321;
        int temp = num;
        int reverse = 0;
        while(num!=0){
            int rem = num%10;
            reverse = (reverse*10) + rem;
            num = num/10;
        }
        if(reverse == temp) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }
    }
}
