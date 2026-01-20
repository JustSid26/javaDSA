package DivAndConq;

public class search2Dmatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)return false;
        return BinarySearch(matrix, target,0,0,matrix.length-1, matrix[0].length-1);
    }
    public boolean BinarySearch(int matrix[][], int target, int rowStart, int colStart,
    int rowEnd, int colEnd){
    if(rowStart > rowEnd || colStart > colEnd) return false;        
    int midRow = (rowStart + rowEnd)/2; //O(1)
    int midCol = (colStart + colEnd)/2; //O(1)
    if(matrix[midRow][midCol] == target) return true;
    else if(matrix[midRow][midCol] > target)
    return BinarySearch(matrix, target,rowStart,colStart,midRow-1, colEnd)
    || BinarySearch(matrix, target,rowStart,colStart,rowEnd, midCol-1); // calls 2 times
    else
    return BinarySearch(matrix, target,midRow+1,colStart, rowEnd,colEnd)
    ||BinarySearch(matrix, target,rowStart,midCol+1, rowEnd,colEnd);
    }
    
}