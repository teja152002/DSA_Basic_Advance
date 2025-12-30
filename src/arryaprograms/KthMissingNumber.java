package arryaprograms;

import java.util.ArrayList;

public class KthMissingNumber {
    public static int kthMissing(int[] arr, int k) {
        // code here
        ArrayList<Integer> missing = new ArrayList<>();
        // 0 1 2 3 4
        // 2 3 4 7 11
        // 1 2 3 4 5 6 7 8 9 10

//        Input: arr[] = [2, 3, 4, 7, 11], k = 5
//        Output: 9
//        Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.

        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {

            } else {
                missing.add(j);
                i = i - 1;
            }
            j++;
        }
        // i->  1, 2
        System.out.println(missing.size());
        System.out.println(missing);
        if (missing.size() < k) {
            return (arr[arr.length - 1]) + k - missing.size();
        } else {
            return missing.get(k - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8}; // 3, 6,9,10,11,12
        int k = 5;
        int ans = kthMissing(arr, k);
        System.out.println(ans);
    }
}
