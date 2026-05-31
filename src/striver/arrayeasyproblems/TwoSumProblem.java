package striver.arrayeasyproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int find = target - arr[i]; // 9 - 2 = 7
            if (map.containsKey(find)) {
                System.out.println(map.get(find) + " " + i);
            } else {
                map.put(arr[i] , i);
            }

        }
        System.out.println(map);
    }
}
