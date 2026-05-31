package striver.arrayeasyproblems;

import java.util.Arrays;

public class SortedRotated {
    public static void reverse(int[] arr, int low, int high) {
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void rotate(int[] nums, int k) {
        reverse(nums, 0, k);
        reverse(nums, k + 1, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public static boolean isSorted(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int index = 0;
        if (isSorted(arr) || arr.length == 1) {
            System.out.println("true");
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    index = i;
                    break;
                }
            }
            System.out.println(index);
            rotate(arr, index);
            System.out.println(isSorted(arr));
        }

    }
}
