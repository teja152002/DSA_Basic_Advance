package arryaprograms;

import java.util.Iterator;

public class SlidingWindow {
    /**
     * Sliding Window : Around four types of patterns in this.
     * There are two types of window.
     * 1. expand - right edge of window
     * 2. shrink - left edge of window.
     * <p>
     * Question Types :
     * ----------------
     * 1. Constant window : arr [-1, 2, 3, 4, 5, -1] , k = 4
     * -> pick up k elements consecutively of max Sum.
     * 2. Longest Subarray / Longest Substring : where
     * 3. Number of subarrays where some condition
     * 4. Finding the minimum / shortest window where some condition
     *
     */
    public static void main(String[] args) {
        // 1. question - optimal of sliding window
//        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
//        int k = 4;
//        int maxSum = 0;
//        int sum = 0;
//        for (int i = 0; i < k; i++) {
//            sum += arr[i];
//        }
//        maxSum = sum;
//
//        for (int i = k; i < arr.length; i++) {
//            sum += arr[i] - arr[i - k];
//            maxSum = Math.max(sum, maxSum);
//        }
//        System.out.println(maxSum);

        // 2. Longest Subarray with sum<=k -> brute , better, optimal
        int[] arr = {2, 5, 1, 7, 10};
        int t = 14;

        // Brute Force
//        int maxlen = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum <= t)
//                    maxlen = Math.max(maxlen, j - i + 1);
//                else if (sum > t)
//                    break;
//            }
//        }
//        System.out.println(maxlen);

        // Better Approach using expand and shrink concept of sliding window
        // TC : O(2N)
//        int l = 0, r = 0, sum = 0, maxlen = 0;
//        int n = arr.length;
//        while (r < n) {
//            sum += arr[r];
//            while (sum > t) { // shrinking loop
//                sum -= arr[l];
//                l++;
//            }
//            if (sum <= t) {
//                maxlen = Math.max(maxlen, r - l + 1);
//            }
//            r++;
//        }
//        System.out.println(maxlen);

        // Optimal Solution of this
        int l = 0, r = 0, sum = 0, maxlen = 0;
        int n = arr.length;
        while (r < n) {
            sum += arr[r];
            if (sum > t) { // shrinking loop
                sum -= arr[l];
                l++;
            }
            if (sum <= t) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
        System.out.println(maxlen);

    }
}
