package arryaprograms;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        Arrays.sort(arr); // 1 2 4 5 7 7 = 6 => 0 1 2 3 4 5
        int n = arr.length;
        int largest = arr[n - 1];
        int secondLargest = Integer.MIN_VALUE;
        int end = n - 2; // Start looking from the second to last element

        // Move backward until we find an element not equal to 'largest'
        while (end >= 0) {
            if (arr[end] != largest) {
                secondLargest = arr[end];
                break;
            }
            end--; // Only decrement once per iteration
        }
        System.out.println(secondLargest);


//        int[] arr = {1, 2, 4, 7, 7, 5};
//        Arrays.sort(arr); // 1 2 4 5 7 7 = 6 => 0 1 2 3 4 5
//        int second = 0;
//        int largest = arr[arr.length - 1];
//        for(int i=arr.length-2;i>=0;i--) {
//            if(arr[i]!=largest) {
//                second = arr[i];
//                break;
//            }
//        }
//        System.out.println(second);


//        int firstLargest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > firstLargest) {
//                secondLargest = firstLargest;
//                firstLargest = arr[i];
//            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
//                secondLargest = arr[i];
//            }
//        }
//        System.out.println("Second largest element in an array : " + secondLargest);
//
//        int firstSmallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < firstSmallest) {
//                secondSmallest = firstSmallest;
//                firstSmallest = arr[i];
//            } else if (arr[i] < secondSmallest && arr[i] != firstSmallest) {
//                secondSmallest = arr[i];
//            }
//        }
//        System.out.println("Second smallest element in an array : " + secondSmallest);
    }
}
