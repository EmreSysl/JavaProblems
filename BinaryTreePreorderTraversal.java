package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		a.right = new TreeNode(2);
		a.right.left = new TreeNode(3);
		BinaryTreePreorderTraversal b = new BinaryTreePreorderTraversal();
		System.out.println(b.preorderTraversal(a));
	}
	
	public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> nodeS = new Stack<>();
        nodeS.add(root);
        List<Integer> list = new ArrayList<>();
        while(!nodeS.isEmpty()) {
        	TreeNode node = nodeS.pop();
        	
        	if(node.left == null && node.right == null) {
        		list.add(node.val);
        		continue;
        	}
        	
        	if(node.left != null) nodeS.add(node.left);
        	if(node.right != null) nodeS.add(node.right);
        	nodeS.add(node);
        	node.left = null;
        	node.right = null;
        }
        return list;
    }

}
