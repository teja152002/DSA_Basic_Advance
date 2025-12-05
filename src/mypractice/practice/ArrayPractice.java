package mypractice.practice;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int[] array = new int[]{12,23,435,56,5,234,23,2354,2345,35};
        System.out.println(Arrays.toString(array));

        System.out.println("Iteration in fwd direction : ");
        for(int ele : array){
            System.out.print(ele + " ");
        }

        System.out.println();
        System.out.println("Iteration in backward direction : ");
        for(int i=array.length-1 ; i>=0;i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Multiplication of 2 table : ");
        for(int i=1; i<=10; i++){
            System.out.println("2 * "+i+" = " + 2*i);
        }

        System.out.println("Addittion of array : ");
        int totalSum = 0;
        for(int i= 0; i<array.length;i++){
            totalSum += array[i];
        }
        System.out.println("Total sum of an array : " + totalSum);

//        System.out.print("Printing array elements using enhanced for loop -> ");
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        System.out.print("Printing array elements using for loop -> ");
//        for(int i=0; i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//        System.out.println("Enter number of elements : ");
//        int n = sc.nextInt();
//
//        System.out.println("Enter array Elements : ");
//        int array[] = new int[n];
//        for(int i=0;i<n;i++) {
//            array[i] = sc.nextInt();
//        }
//
//        System.out.println(Arrays.toString(array));



    }
}
