package arryaprograms;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {12, 24, 36, 48, 52, 123};
        boolean res = true; // Assume it is sorted initially


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { // If any element is greater than the next
                res = false;           // It's not sorted
                break;                 // No need to check the rest
            }
        }

        System.out.println(res);
    }
}
