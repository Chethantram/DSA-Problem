// Set Matrix Rows and Columns to Zeroes TC-O(N^2)  SC-O(1)
package Array2D;

public class SetMatrixZero {

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRow = false, firstCol = false;

        // make first row and first col whether it is zero or value
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        firstRow = true;
                    }
                    if (j == 0) {
                        firstCol = true;
                    }
                    matrix[0][j] = 0; //first row
                    matrix[i][0] = 0; //first col
                }
            }
        }
        // Make a change in inner matrix except first row and col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Make a change on first row and col
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{0, 1, 2, 0},
        {3, 4, 0, 2},
        {1, 3, 1, 5}};

        setZeroes(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println(mat[i][j] + " ");
            }
        }
    }
}
