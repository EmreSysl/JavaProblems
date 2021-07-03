package LeetCode;

import java.util.LinkedList;

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(0);
		ListNode d = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = b;
		LinkedListCycle e = new LinkedListCycle();
		System.out.println(e.hasCycle(a));

	}
	
	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while(!(fast == null || fast.next == null)) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) return true;
		}
		return false;
    }
	
	public void print(ListNode node) {
		if(node.val == 0 && node.next == null) System.out.println(false);
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
