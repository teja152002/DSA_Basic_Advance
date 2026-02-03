package search;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 100};
        int target = 5;

        // Time complexity : O(n) , becuase it will run through entire loop once.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Index found at : " + i);
                break;
            }
        }
    }
}
