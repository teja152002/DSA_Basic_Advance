package striver.arrayeasyproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RightRotateArray {
    public static void rightRotate(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }

    static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rightRotate(arr);
        rightRotate(arr);rightRotate(arr);

        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> al = new ArrayList<>();
        Collections.sort(al);
    }
}
