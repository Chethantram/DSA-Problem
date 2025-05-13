//  Diagonal Traverse  TC-O(N) SC-O(1)
// package Array2D;

public class DiagonalMatrix {

    public static int[] printDiagonalMatrix(int[][] mat) {
        int n = mat.length; //row
        int m = mat[0].length; //col
        int[] arr = new int[n * m];
        int i = 0;
        int row = 0, col = 0;
        boolean up = true;

        while(row<m && col<n)
        {
            if(up)
            {
                while(row>0 && col<n-1)
                {
                    arr[i++] = mat[row][col];
                    row--;
                    col++;
                }
                 arr[i++] = mat[row][col];

                 if(col == n-1)
                 {
                    row++;
                 }
                 else{
                    col++;
                 }

            }
            else{
                 while(col>0 && row<m-1)
                {
                    arr[i++] = mat[row][col];
                    row++;
                    col--;
                }
                 arr[i++] = mat[row][col];

                 if(row == m-1)
                 {
                    col++;
                 }
                 else{
                    row++;
                 }

            }
            up = !up;
        }
        return arr;
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

        int[] arr = printDiagonalMatrix(mat);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }

}
