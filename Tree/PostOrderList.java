package Tree;
import java.util.*;
public class PostOrderList {
    ArrayList<Integer> nodeList = new ArrayList<>();
    public List<Integer> postOrderList(TreeNode root){
        if(root == null) return nodeList;
        postOrder(root);
        return nodeList;
    }
    public void postOrder(TreeNode node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        nodeList.add(node.val);
    }
}
