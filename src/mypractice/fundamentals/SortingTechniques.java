package mypractice.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class SortingTechniques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements to be sorted : ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }


        // Bubble Sort
        System.out.println("Bubble Sort");
        for(int i=0 ;i<n;i++) {
            for(int j=i+1; j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
