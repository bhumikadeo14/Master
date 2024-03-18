package tutorials;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		
		//Corner case if root is null there are no child nodes to invert
		
		if(root==null) {
			return root;
	}
		
		//Traverse left and right nodes of the root
		
		TreeNode left=invertTree(root.left);
		TreeNode right=invertTree(root.right);
		
		//Swap
		
		root.right=left;
		root.left=right;
		return root;
	}
}
