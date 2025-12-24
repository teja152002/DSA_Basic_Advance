package arryaprograms;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicate {
    private static Map<Integer, Integer> map;

    /**
     * Remove duplicate from the sorted array.
     */
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
               //    0  1  2  3  4  5  6

        int i = 0;
        int j = 1;
        while(j<=arr.length-1){
            if(arr[i]==arr[j]){
                //i++;
                j++;
            }
            else if(arr[i] != arr[j]){
                int temp = arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = temp;
                i++;
                j++;

            }
        }
        System.out.println(Arrays.toString(arr));

//        // Brute Force
//        HashSet<Integer> set = new HashSet<>();
//        for(int ele : arr)
//        {
//            set.add(ele);
//
//        }
//
//        Iterator<Integer> itr = set.iterator();
//        int i =0 ;
////        while(itr.hasNext()) {
////            arr[i] = itr.next();
////            i++;
////        }
//        for(int ele : set) {
//            arr[i] = ele;
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));


    }
}
