package sortingalgos;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    /**
     * Merge sort takes better time complexity. It is recursive algorithm.
     * for example : 3,1,2,4,1,5,2,6,4  => n = 9
     * Definition : Merge sort means divide and merge.
     *
     *
     */
    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> al = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                al.add(arr[left]);
                left++;
            } else {
                al.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            al.add(arr[left]);
            left++;
        }
        while (right <= high) {
            al.add(arr[right]);
            right++;
        }
        //System.out.println(al);
        for (int i = low; i <= high; i++) {
            arr[i] = al.get(i - low);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
