package tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Practice {

//    static void mergeSort(int[] arr, int low, int high) {
//        if (low >= high) {
//            return;
//        }
//        int mid = (low + high) / 2;
//        mergeSort(arr, low, mid);
//        mergeSort(arr, mid + 1, high);
//        merge(arr, low, mid, high);
//    }
//
//    static void merge(int[] arr, int low, int mid, int high) {
//        ArrayList<Integer> al = new ArrayList<>();
//        int left = low, right = mid + 1;
//        while (left <= mid && right <= high) {
//            if (arr[left] <= arr[right]) {
//                al.add(arr[left]);
//                left++;
//            } else {
//                al.add(arr[right]);
//                right++;
//            }
//        }
//        while (left <= mid) {
//            al.add(arr[left]);
//            left++;
//        }
//        while (right <= high) {
//            al.add(arr[right]);
//            right++;
//        }
//        for (int i = low; i <= high; i++) {
//            arr[i] = al.get(i - low);
//        }
//    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1; // Start i from the element after pivot
        int j = high;

        while (i <= j) {
            // Find element greater than pivot (staying within bounds)
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // Find element smaller than or equal to pivot
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot with j
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,12,67,3,9,4,0,45,1,2,8,90,100};
        //mergeSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        // insertion sort - take an element from un sorted list and place it in sorted list
//        for (int i = 0; i < arr.length; i++) {
//            int j = i;
//            while (j > 0 && arr[j - 1] > arr[j]) {
//                int temp = arr[j - 1];
//                arr[j - 1] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        // selection sort - select the minimum and place it in crct order
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[min]) {
//                    min = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // bubble sort
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = false;
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    flag = true;
//                }
//            }
//            if (!flag) {
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));


    }
}
