package arryaprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5};
        ArrayList<Integer> union = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!union.contains(arr2[i])) {
                union.add(arr2[i]);
            }
        }
        int i = 0, j = 0;
//        for (int k = 0; k < union.length; k++) {
//            if (arr1[i] < arr2[j]) {
//                union[k] = arr1[i];
//                i++;
//            } else if (arr2[j] < arr1[i]) {
//                union[k] = arr2[j];
//                j++;
//            } else if (arr1[i] == arr2[j]) {
//                union[k] = arr1[i];
//                union[k + 1] = arr2[j];
//                i++;
//                j++;
//                k++;
//            }
//        }
        for (Object ele : union.toArray()) {
            System.out.print(ele+" ");
        }

    }
}
