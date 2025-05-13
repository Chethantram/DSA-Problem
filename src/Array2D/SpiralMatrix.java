package Array2D;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> res = new ArrayList<>();
        if(mat.length == 0)
        {
            return res;
        }

        int rowBegin = 0;
        int rowEnd = mat.length-1;
        int colBegin = 0;
        int colEnd = mat[0].length-1;

        while (rowBegin<=rowEnd && colBegin<=colEnd) {
            // Traverse Right
            for (int i = colBegin; i <= colEnd; i++) {
                res.add(mat[rowBegin][i]);
            }
            rowBegin++;
            // Traverse Down
            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(mat[i][colEnd]);
            }
            colEnd--;

            // Traverse left
            if (rowBegin<=rowEnd) {
                
                for (int i = colEnd; i >= colBegin; i--) {
                    res.add(mat[rowEnd][i]);
                }
            }
            rowEnd--;

            // Traverse Up
            if (colBegin<=colEnd) {
                
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(mat[i][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, 
                       {5, 6, 7, 8}, 
                       {9, 10, 11, 12}, 
                       };
                       
        List<Integer> res = spiralOrder(mat);
        for(int ele:res)
        {
            System.out.print(ele+" ");
        }
          System.out.println();

    }
}
