package tutorials;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal extends TreeNode{
	
	public List<Integer> postordertraversal(TreeNode root){
		
		List<Integer> res= new ArrayList();
		dfs(res,root);
		return res;
		
	}
	void dfs(List<Integer> res, TreeNode node){
		if(node!=null) {
			
			if(node.left!=null) {
			dfs(res,node.left);
				
			}
			
			if(node.right!=null) {
				dfs(res,node.right);
			}
			res.add(node.val);
		}
		
	}

}
