package arryaprograms;

public class KadanesAlgorithm {
    /**
     * Kadane's Algorithm : The idea of Kadane's algorithm is to traverse over the array from left to right
     * and for each element, find the maximum sum among all subarrays ending at that element.
     * The result will be the maximum of all these values.
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int maxSum = 0;
        int arrStart = 0, arrEnd = 0;
        int sum = 0;
        int start = 0;

        // Optimal Approach
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) start = i;
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                arrStart = start;
                arrEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = arrStart; i <= arrEnd; i++) {
            System.out.print(arr[i] + " "); // This is for printing the values of maximum subArray part.
        }
        System.out.println(maxSum);

//        Better Approach
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                maxSum = Math.max(sum, maxSum);
//            }
//        }
//        System.out.println(maxSum);
    }
}
