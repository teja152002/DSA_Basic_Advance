package arryaprograms;

import java.sql.Array;
import java.util.ArrayList;

public class LeadersInArray {
    /**
     * Question : Every element is leader in an array if right side of elements are smaller
     * for example : [10, 22, 12, 3, 0, 6]
     * Output-> [22, 12, 6]
     * So here, if we take 22, everything is less than 22 right side of it (22 < 12), (22 < 3), ...
     *
     */
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        // Optimal - find max in the right

        ArrayList<Integer> res = new ArrayList<>();

        // 10, 22, 12, 3, 0, 6
        // We are traversin from last and checking if any number greater than max is there if found we add it to res
        int end = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while (end >= 0) {
            if (arr[end] > max) {
                max = arr[end];
                res.add(max);
            }
            end--;
        }
        System.out.println(res);
        // brute force
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = false;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    flag = true;
//                } else {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                res.add(arr[i]);
//            }
//        }
//        res.add(arr[arr.length - 1]);
//        System.out.println(res);
    }
}
