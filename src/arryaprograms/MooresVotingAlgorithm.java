package arryaprograms;

import java.util.HashMap;
import java.util.Map;

public class MooresVotingAlgorithm {

    public static int votingAlgo(int[] arr) {

        /** Moore's Voting Algorithm : This algorithm works on the fact that if an element occurs more than N/2 times,
         *                             it means that the remaining elements other than this would definitely be less than N/2.
         *   -> It is strictly for more than N/2 elements. Not for N/2.
         */

        int ele = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                count1++;
            }
        }
        if (count1 >= (arr.length / 2)) return ele;
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int n = arr.length;

        // Brute force - will be using iterate through the entire array and count on each element and check, using inner loop.
        System.out.println(votingAlgo(arr));
        // Using Hashing Technique - better approach
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//        System.out.println(map);
//
//        int res = 0;
//        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
//            if (m.getValue() >= n / 2) {
//                res = m.getKey();
//                break;
//            }
//        }
//        System.out.println(res);
    }
}
