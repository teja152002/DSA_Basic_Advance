package mypractice.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NumberHasing {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1,2};
        int hash[] = new int[13];
        for(int i=0; i<arr.length;i++){
        hash[arr[i]] += 1;
        }
        // Inside main we can declare upto 10^6 in integer array, in global we can declare upto 10^7 in array integer.
        System.out.println(hash[1]); // It will give count of 1

        // Number hashing using maps -> Time complexity of maps is log(N) in all cases like best, worst and average cases.
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            int freq = 0;
            if(hm.containsKey(arr[i])) {
                freq = hm.get(arr[i]);
            }
            freq++;
            hm.put(arr[i], freq);
        }
        System.out.println(hm);
        int highest = Integer.MIN_VALUE;
        int key = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > highest){
                highest = entry.getValue();
                key = entry.getKey();
            }
        }

        System.out.println(key + " -> " +highest);


    }
}
