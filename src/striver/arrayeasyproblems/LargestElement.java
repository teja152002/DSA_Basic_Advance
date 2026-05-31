package striver.arrayeasyproblems;

import java.util.Arrays;

public class LargestElement {
    static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        // Brute Force -> sort the array and print arr[arr.length -1] element.
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
            }
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println("Max Element -> " + maxi + " - Min Element -> " + mini);


    }
}
