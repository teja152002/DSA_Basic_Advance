package sortingalgos;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgorithms {
    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int k = 0; k < n - 1; k++) {
            int index = k;
            for (int i = k + 1; i < n; i++) {
                if (arr[i] < arr[index]) {
                    index = i;
                }
            }
            // Swap arr[k] with arr[index]
            int temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
        }
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of elements : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter array elements : ");
//        for(int i=0; i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        // Selection sort -> select minimum and swap it with first index and go on
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
 }
