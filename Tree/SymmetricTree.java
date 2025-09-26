package Tree;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return isSymmetricUtil(root.left, root.right);

    }
    public static boolean isSymmetricUtil(TreeNode Left, TreeNode Right){
        if(Left == null || Right == null ) return Left == Right;
        if(Left.val != Right.val) return false;
        return isSymmetricUtil(Left.left, Right.right);
    }
    public static void main(String args[]){

    }
}
