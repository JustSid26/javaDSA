package Tree;
import java.util.*;
public class PathSum2 {
    List<Integer> solution = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        
    }
    public void function(TreeNode node, int targetSum){
        if(node == null) return;
        solution.add(node.val);
        if(node.left == null && node.right == null && node.val == targetSum) result.add(solution);
        else{
            function(node.left, targetSum-node.val);
            function(node.right, targetSum-node.val);
            solution.remove(solution.size()-1);
        }
    }
}
 