package recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static int[] reverse(int[] arr, int start, int end){
        if(start == end){
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverse(arr, start+1, end-1);

    }
    public static boolean isPalindrome(String s, int start, int end){
        if(start==end){
            return true;
        }
        if(s.charAt(start) == s.charAt(end)){
            return isPalindrome(s, start+1, end-1);
        } else {
            return false;
        }
    }

    public static boolean isPalindrome2(String s, int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return isPalindrome2(s, i+1);
    }
    public static int fibonacci(int n){
        // if(n ==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        // if(n==2){
        //     return (0+1);
        // }
        if(n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
        // int a = 0, b = 1;
        // int c = 0;

        // if(n==1){
        //     return 1;
        // }
        // if(n==2){
        //     return a+b;
        // }

        // if(n>2){
        //     for(int i = 2; i<=n;i++){
        //         c = a+b;
        //         a = b;
        //         b = c;
        //     }
        // }
        // return c;
    }

    public static void kthCharacter(int k) {
        String s = new String("a");
        for(int i=0; i<k;i++){
            if(s.length() < k){
                for(int j = 0; j<s.length();j++) {
                    char c = (char) (s.charAt(i) + 1);
                    s += c;
                    System.out.println(s);
                    break;
                }
                System.out.println("outer loop" + s);
            } else {
                System.out.println(s.charAt(k));
            }
        }
    }
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int rev[] = reverse(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(rev));
//
//        System.out.println(isPalindrome( "ABCDCBA", 0, "ABCDCBA".length()-1));
//        String s = "abcd";
//        System.out.println("Palinndrome 2 method : "+isPalindrome2(s, 0));
//
//        System.out.println("Fibonacci : " + fibonacci(4));

       // kthCharacter(3);
        String word = "a";
        char c = (char) (word.charAt(0) + 1);
        word += c;
        System.out.println(word);



    }
}
