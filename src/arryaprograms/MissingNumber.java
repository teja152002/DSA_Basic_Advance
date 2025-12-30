package arryaprograms;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};

        int n = arr.length;
        int sum = (n +1)* (n+2) / 2;
        for(int i=0;i<arr.length;i++){
            sum -=arr[i];
        }
        System.out.println(sum);
    }
}
