package maths;

public class GCD {
    public static int gcd(int a, int b){

        if(b==0){
            return a;
        }
        return gcd(b, a%b);

    }
    public static void main(String[] args) {
        int n1 = 20, n2 = 15;
        int res = 0;
        for(int i=1; i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
               res = Math.max(res,i);
            }
        }
        System.out.println("GCD using loop : "+ res);
        System.out.println("GCD using recursion : " + gcd(n1, n2));
    }
}
