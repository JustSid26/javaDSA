package Tree;

import java.util.ArrayList;

public class InOrderList {
    ArrayList<Integer> nodeList = new ArrayList<>();
    public List<Integer> inOrder(TreeNode root){
        if(root == null) return nodeList;
        Traverse(root);
        return nodeList;
    }
    public void Traverse(TreeNode node){
        if(node == null) return;
        Traverse(node.left);
        nodeList.add(node.val);
        Traverse(node.right);
    }
}
