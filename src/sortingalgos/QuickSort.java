package sortingalgos;

import java.util.Arrays;

public class QuickSort {
    /**
     * Quick Sort : Pick a pivot element and place it in correct position. Hence total elements will be sorted.
     * Pivot : pivot means any element in the entire array.
     * -> either 1st element of an array
     * -> last element of an array
     * -> median element of an array
     * -> any random element from an array.
     * <p>
     * Ex : 4 6 2 5 7 9 1 3  -> sortedd version will look like -> 1 2 3 4 5 6 7 9
     * index-> 0 1 2 3 4 5 6 7
     * Algorithm :
     * 1) pick a pivot element and place it in correct position
     * -> for example lets say pivot value is 4
     * 2) After that place smaller elements of an array will be left side of pivot and larger elements will right side of pivot element
     * ->  4 will be in the 3rd index
     * -> so that after this step array will look like -> 2 1 3 4 6 5 7 9
     * 3) repeat 1 and 2 until all elements are sorted.
     */

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high) {
                i++;
            }
            while (arr[j] > pivot && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
