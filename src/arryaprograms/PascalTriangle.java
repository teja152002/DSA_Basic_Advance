package arryaprograms;

public class PascalTriangle {
    /**
     * Pascal Triangle is :
     *          1          r->1
     *         1 1          ->2
     *        1 2 1         ->3
     *       1 3 3 1        ->4
     *      1 4 6 4 1       ->5
     *     1 5 10 10 5 1    ->6
     * Pascal Triangle question can be asked by 3 ways
     * 1) print the element of the rowth, colth eelement from pascal traingle
     * ex : row = 5, col = 4
     * output : 6
     * So according to the principle of ncr we can acheive this
     * ncr = (n-1) c (r-1) => this will give us output
     * ncr = ( n! ) / r! (n-r)!
     * <p>
     * 2) print any nth row or col according to the question
     * <p>
     * 3) print entire pascal triangle according to the rowscols. n= 5
     */
    private static int rowCol(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        // question - 1
        int n = 5, r = 3;
        int res = rowCol(n - 1, r - 1);
        System.out.println("Question - 1 => " + res);

        // question - 2
        // Brute Force
        int row = 5;
        for (int c = 1; c <= row; c++) {
            System.out.print(rowCol(row - 1, c - 1) + " ");
        }
        System.out.println();

        // Better Approach for Question - 2
        int ans = 1;
        System.out.print(ans + " ");
        for(int i=1;i<row;i++){
            ans = ans * (row-i);
            ans = ans / i;
            System.out.print(ans + " ");
        }

    }
}
