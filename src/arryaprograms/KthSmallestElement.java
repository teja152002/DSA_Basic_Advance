package arryaprograms;

import java.util.*;
import java.util.stream.Collectors;

public class KthSmallestElement {
    public static int kthSmallest(int[][] mat, int k) {
        // code here
        // TreeSet<Integer> set = new TreeSet<>();

        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[i].length;j++){
        //         set.add(mat[j][i]);
        //     }
        // }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int x = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                map.put(x++, mat[i][j]);
            }
        }

        List<Integer> values = new ArrayList<>(map.values());

        // 2. Sort the values list
        Collections.sort(values);

        // 3. Create a new LinkedHashMap and reassign sorted values to sequential keys
        LinkedHashMap<Integer, Integer> finalMap = new LinkedHashMap<>();
        for (int i = 0; i < values.size(); i++) {
            finalMap.put(i, values.get(i));
        }

        System.out.println(finalMap);
//        ArrayList<Integer> list = new ArrayList<>(set);
//        return list.get(k-1);
        return finalMap.get(k - 1);
    }

    public static void main(String[] args) {
        int[][] mat = {
                {16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94}
        };
        int k = 3;
        System.out.println(kthSmallest(mat, k));
    }
}
