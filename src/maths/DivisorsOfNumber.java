package maths;

import java.util.ArrayList;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        int n = 36;
        // Brute force
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        // optimal
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if(i!=n/i){
                    list.add(n/i);
                }
            }
        }
        System.out.println(list);
    }
}
