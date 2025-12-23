package sortingalgos;

import java.util.Arrays;

public class InsertionSort {
    /**
     * Insertion means iteratively inserting each element of an unsorted list into its correct position in a
     * sorted portion of the list.
     * <p>
     * for example :  12, 11, 13, 5, 6
     * 11 12 13 5 6
     * <p>
     * 11 12 5 13 6
     * 11 5 12 13 6
     * 5 11 12 13 6
     * <p>
     * 5 11 12 6 13
     * 5 11 6 12 13
     * 5 6 11 12 13 => hence sorted. Take one element from left and sort it into right
     */
    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("----------------------");
        System.out.println(Arrays.toString(arr));
    }
}
