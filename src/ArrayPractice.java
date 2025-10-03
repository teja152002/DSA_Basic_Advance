import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        System.out.print("Printing array elements using enhanced for loop -> ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.print("Printing array elements using for loop -> ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter array Elements : ");
        int array[] = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));



    }
}
