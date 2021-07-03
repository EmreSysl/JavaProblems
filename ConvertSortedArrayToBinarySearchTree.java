package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		ConvertSortedArrayToBinarySearchTree a = new ConvertSortedArrayToBinarySearchTree();
		int[] nums = {1};
		a.sortedArrayToBST(nums);
	}
		
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) return null;
		TreeNode head = helper(nums, 0, nums.length-1);
		return head;
    }
	
	public TreeNode helper(int[] nums, int low, int high) {
		if(low>high) return null;
	    int mid = low + (high-low)/2;
	    TreeNode node = new TreeNode(nums[mid]);
	    node.left = helper(nums, low, mid-1);
	    node.right = helper(nums, mid+1, high);
	    return node;
    }

}
