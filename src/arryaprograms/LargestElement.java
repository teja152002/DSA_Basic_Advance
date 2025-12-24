package arryaprograms;

import mypractice.practice.Main;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 0};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in an array : " + largest);
    }
}
