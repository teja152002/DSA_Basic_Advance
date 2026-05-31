package striver.arrayeasyproblems;

import java.util.Arrays;

public class MissingNumber {
    static void main(String[] args) {
        int[] arr = {3, 1, 2, 5}; // 1,2,3,4,5,7,8 => 7 (count) => 8 (original)
        // Brute Force
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] != arr[i + 1] - 1) {
//                System.out.println(arr[i] + 1);
//                break;
//            }
//        }

        //  Better Approach
        int n = arr.length + 1;
        int[] temp = new int[n];
        for (int i = 0; i < arr.length; i++) {

            temp[arr[i] - 1]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }

        // Optimal Approach
//        int n = arr.length + 1;
//        int sum = 0;
//        int totoalSum = n * (n + 1) / 2;
//        for (int ele : arr) {
//            sum += ele;
//        }
//        System.out.println(totoalSum - sum);
    }
}
