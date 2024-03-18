package tutorials;

import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.


public class BinaryTreeInorderTraversal extends TreeNode{
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> res=new ArrayList();
		dfs(res,root);
		return res;
		
	}
		
	       void dfs(List<Integer> res,TreeNode node) {
	    	   if(node!=null) {
	    		   if(node.left!=null) {
	    			   dfs(res,node.left);
	    		   }
	    		   res.add(node.val);
	    		   
	    		   if(node.right!=null) {
	    			   dfs(res,node.right);
	    		   }
	    			   
	    		   }
	    	   }
	    	   
	       
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int root=2;
	}

}

