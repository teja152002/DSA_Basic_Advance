import java.util.Objects;
import java.util.Stack;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        ArrayList<ArrayList<Integer>> row = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> col = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                col.add(arr[j]);
            }
            row.add(col);
        }

        System.out.println(row);
    }
}
