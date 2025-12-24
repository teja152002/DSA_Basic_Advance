package arryaprograms;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4};
        boolean res = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] <= arr[i+1]){
                res = true;
            } else {
                res = false;
            }
        }
        System.out.println(res);
    }
}
