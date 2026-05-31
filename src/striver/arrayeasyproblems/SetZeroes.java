package striver.arrayeasyproblems;

import java.util.ArrayList;

public class SetZeroes {

    public static void setZeroes(int[][] matrix) {

        ArrayList<int[]> list = new ArrayList<>();

        // Store all zero positions
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }

        // Make rows and columns zero
        for (int[] pos : list) {

            int row = pos[0];
            int col = pos[1];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {

                    if (i == row || j == col) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        setZeroes(matrix);
    }
}