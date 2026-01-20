package fuck.Tree;

public class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(){}    
    TreeNode(int val){
        this.val  = val;
    }
    TreeNode(TreeNode left, TreeNode right, int val){
        this.left = left;
        this.right = right;
        this.val = val;
    }
    void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    void postOrder(TreeNode root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val +" ");
    }
    void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode root = one;
        one.left = two;
        one.right = three;
        three.right = four;
        TreeNode obj = new TreeNode();
        obj.inOrder(root);
        System.out.println();
        obj.postOrder(root);
        System.out.println();
        obj.preOrder(root);
    }
}
