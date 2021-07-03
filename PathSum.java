package LeetCode;

import java.util.Stack;

public class PathSum {

	public static void main(String[] args) {
		PathSum a = new PathSum();
		TreeNode b = new TreeNode(1);
		b.left = new TreeNode(2);
		b.right = new TreeNode(3);
		System.out.println(a.hasPathSum2(b, 6));
	}
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if(root == null) return false;
		targetSum=targetSum-root.val;
		if(root.left == null && root.right == null && targetSum ==0){
	        return true;
	    }
		return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
	
	public boolean hasPathSum2(TreeNode root, int targetSum) {
	    if(root == null) return false;
	    Stack<TreeNode> node = new Stack<>();
	    Stack<Integer> target = new Stack<Integer>();
	    node.add(root);
	    target.add(targetSum-root.val);
	    while(!node.isEmpty()) {
	    	TreeNode temp = node.pop();
	    	int sum = target.pop();
	    	
	    	if(temp.left == null && temp.right == null && sum == 0) {
	    		return true;
	    	}
	    	
	    	if(temp.left != null) {
	    		node.add(temp.left);
	    		target.add(sum-temp.left.val);
	    	}
	    	
	    	if(temp.right != null) {
	    		node.add(temp.right);
	    		target.add(sum-temp.right.val);
	    	}
	    }
	    return false;
	}

}
