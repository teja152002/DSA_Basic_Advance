package sortingalgos;

import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void recBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
       // System.out.println(Arrays.toString(arr));

        recBubbleSort(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        //bubbleSort(arr);
        recBubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

        /**
         *  bubble sort means adjacent swappping
         *  for ex : 3 1 2 4 1
         *      1 3 2 4 1
         *      1 2 3 4 1
         *      1 2 3 4 1
         *      1 2 3 1 4
         *
         *      1 2 1 3 4
         *      1 1 2 3 4
         *
         */

    }
}
