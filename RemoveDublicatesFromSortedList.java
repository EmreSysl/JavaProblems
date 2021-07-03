package LeetCode;

public class RemoveDublicatesFromSortedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		RemoveDublicatesFromSortedList a = new RemoveDublicatesFromSortedList();
		a.deleteDuplicates(head);

	}
	
	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummyhead = new ListNode(0);
		ListNode draft = dummyhead;
		ListNode temp = new ListNode(150);
		while(head != null) {
			
			if(head.next == null && head.val != temp.val) {
				dummyhead.next = head;
				break;
			} 
			
			if(head.val == head.next.val) {
				head = head.next;
				continue;
				
			} else {
				dummyhead.next = head;
				temp = head;
				head = head.next;
				dummyhead = dummyhead.next;
			}
						
		}
		print(draft.next);
		return draft.next;
		
    }
	
	public void print(ListNode head) {
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}
