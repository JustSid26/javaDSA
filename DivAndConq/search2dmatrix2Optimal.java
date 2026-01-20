package DivAndConq;

public class search2dmatrix2Optimal {
    public boolean searchMatrix(int[][] matrix, int target){
        int horizontal = matrix.length;
        int vertical = matrix[0].length;
        int row = 0;
        int col = vertical - 1;
        while(row < horizontal && col >= 0){
            if(matrix[row][col] == target) return true;
            if(matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }
}
