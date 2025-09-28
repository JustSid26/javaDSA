package Tree;
import java.util.*;
public class PreOrderList {
    ArrayList<Integer> nodeList = new ArrayList<>();
    public List<Integer> preOrderList(TreeNode root){
        if (root == null) return nodeList;
        return nodeList;
    }
    public void preOrder(TreeNode root){
        if(root == null) return;
        nodeList.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
