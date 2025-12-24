package arryaprograms;

import java.util.Arrays;

public class LeftRotateByone {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // output : 2,3,4,5,1
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));

//        int tempRight = arr[arr.length - 1];
//        for (int i = arr.length - 1; i > 0; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[0] = tempRight;
//        System.out.println(Arrays.toString(arr));

    }
}
