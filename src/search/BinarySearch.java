package search;

public class BinarySearch {
    static void main(String[] args) {
        /**
         * Binary Search Algo : Array should be sorted ordet.
         *  int low, high, mid = (low + high) / 2 -> old version
         *  Updated mid : mid = low + (high - low) / 2;
         *  Time complexity : O(logn)
         */

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 100};
        int target = 3;

        int result = -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (result != -1) {
            System.out.println("Index found at : " + result);
        } else {
            System.out.println("Index not found !");
        }


    }
}
