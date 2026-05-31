package striver.arrayeasyproblems;

import java.util.ArrayList;

public class LeadersArray {
    /**
     * Problem statement : Find out all the numbers where there right side of numbers should be smaller
     * for example : arr[] = [10, 22, 12, 3, 0, 6]
     * in this example : leaders are -> [22, 12, 6]
     * because everything right side of 22, 12, 6 is smaller
     * <p>
     * logic is arr[ele] right should be smaller -> arr[ele] < arr[right most elements] -> which means ar[ele] > maximum on the right condition should be check, then it is leader of an array
     */
    static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[arr.length - 1]);
        int maxi = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxi) {
                al.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        System.out.println(al);
    }
}
