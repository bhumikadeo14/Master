package tutorials;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderPractise extends TreeNode{
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> result=new ArrayList();
		dfs(result,root);
		return result;
}
	
	void dfs(List<Integer> result,TreeNode node) {
		
		if(node!=null) {
			
			if(node.left!=null) {
				dfs(result,node.left);
			}
			
			result.add(node.val);
			
			if(node.right!=null) {
				dfs(result,node.right);
				
			}
			
		}
	}

	
	

}
