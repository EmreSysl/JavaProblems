package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		MergeSortedArray a = new MergeSortedArray();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		a.merge(nums1, 3, nums2, 3);
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int len = m+n;
	    for(int i=m; i<len; i++){
	        nums1[i]=nums2[--n];
	    }
	    Arrays.sort(nums1);
	    System.out.println(Arrays.toString(nums1));
	}
}
