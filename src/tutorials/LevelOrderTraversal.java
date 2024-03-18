package tutorials;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	


	
	    public List<List<Integer>> levelOrder(TreeNode root) {
	    	
	    	//Variable to to display result
	        List<List<Integer>> result = new ArrayList<>();
// if root is null
	        if (root == null) {
	            return result;
	        }
//queue declaration
	        Queue<TreeNode> q = new LinkedList<>();
	        //adding root value to the queue
	        q.offer(root);
//traversin the queue until it is empty
	        while (!q.isEmpty()) {
	        	//size of the queue
	            int levelSize = q.size();
	            List<Integer> currentLevel = new ArrayList<>();

	            for (int i = 0; i < levelSize; i++) {
	                TreeNode node = q.poll();
	                currentLevel.add(node.val);

	                if (node.left != null) {
	                    q.offer(node.left);
	                }
	                if (node.right != null) {
	                    q.offer(node.right);
	                }
	            }

	            result.add(currentLevel);
	        }

	        return result;
	    }
	

}
	


