package LeetCode;

import java.util.*;


public class BinaryTreePostorderTraversal {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		a.right = new TreeNode(2);
		a.right.left = new TreeNode(3);
		BinaryTreePostorderTraversal b = new BinaryTreePostorderTraversal();
		System.out.println(b.postorderTraversal(a));
	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> nodeL = new Stack<>();
        nodeL.add(root);
        
        while(!nodeL.isEmpty()) {
        	TreeNode node = nodeL.pop();
        	
        	if(node.left == null && node.right == null) {
        		list.add(node.val);
        		continue;
        	}
        	
        	nodeL.add(node);
            if(node.right != null) nodeL.add(node.right);
        	if(node.left != null) nodeL.add(node.left);
        	
        	node.left = null;
        	node.right = null;
        }
        return list;
    }

}
