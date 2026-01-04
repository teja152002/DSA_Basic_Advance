package arryaprograms;

public class SubArray {
    public static void main(String[] args) {
        /**
         * SubArray : It is a continuous, sequential part of a larger array, maintaining the original
         *              of elements, essentially a "slice" from the original.
         *              For example, in [1, 2, 3, 4], [2, 3] is a subarray,
         *              but [1, 3] is not, as elements must be adjacent in the source.
         *
         * For [1,2,3,4] sub arrays are [1], [2], [3], [4], [1,2], [1,2,3], [1,2,3,4], [2,3], [2,3,4], [3,4]
         */

        // Sub Array Generation
//        int[] arr = {1, 2, 3, 4};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k] + " ");
//                }
//                System.out.println();
//            }
//        }

        // Write a java program to find longest sub array with sum of k
        // Brute Force Approach
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int target = 6;
        // Output : longest sub array is [1,1,1] from index [3 -> 5] so output is {3}
        int longestSub = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//                if (sum == target) {
//                    longestSub = Math.max(longestSub, j - i + 1);
//                }
//            }
//        }
//
//        System.out.println(longestSub);

        // Better Approach
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    longestSub = Math.max(longestSub, j - i + 1);
                }
            }
        }
        System.out.println(longestSub);

    }
}
