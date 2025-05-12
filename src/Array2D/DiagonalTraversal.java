package Array2D;

import java.util.ArrayList;

public class DiagonalTraversal {

    static ArrayList<Integer> diagonalOrder(int[][] mat) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = mat.length; // Number of rows
        int m = mat[0].length; // Number of columns


        for (int row = 0; row < n; row++) {
            int i = row, j = 0;

            while (i >= 0 && j < m) {
                res.add(mat[i][j]);
                i--;
                j++;
            }
        }

        for (int col = 1; col < m; col++) {
            int i = n - 1, j = col;

            while (i >= 0 && j < m) {
                res.add(mat[i][j]);
                i--;
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20},};
        ArrayList<Integer> res = diagonalOrder(mat);
        for (int val : res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
