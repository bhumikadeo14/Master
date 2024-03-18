package tutorials;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal extends TreeNode{
	
	public List<Integer> preorderTraversal(TreeNode root) {
	    List<Integer> result = new ArrayList<>();
	    dfs(result, root);
	    return result;
	}

	void dfs(List<Integer> result, TreeNode node) {
	    if (node != null) {
	        result.add(node.val); // Corrected from 'result.add(val);'

	        if (node.left != null) {
	            dfs(result, node.left); // Corrected from 'dfs(result, node);'
	        }

	        if (node.right != null) {
	            dfs(result, node.right); // Corrected from 'dfs(result, node);'
	        }
	    }
	}

}
