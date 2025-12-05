package maths;


public class PrimeNumber {
    public static boolean isPrime(int n){

        if(n<2){
            return false;
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
