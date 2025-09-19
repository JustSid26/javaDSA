package Arrays;

public class TransposeMat {
    public static int [][] transpose(int [][] matrix){
        int [][] tMat = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                tMat[i][j] = matrix[i][j];
            }
        }
        return tMat;
    }
    public static void main(String args[]){
        
    }
}
