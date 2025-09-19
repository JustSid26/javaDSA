package LinkedList;
public class ReorderList{
	public static ListNode revList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode curr = head;
		ListNode prev = null;
		while(curr!=null){
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	public static ListNode ReorderList(ListNode head){
		ListNode curr = head;
		ListNode rev = revList(head);

		while(curr != null && curr.next != null){
			curr.next = rev;
			curr = curr.next.next;
			curr.next = curr.next;
			rev = rev.next.next;
		}
		return head;
	}
	public static void main(String args[]){
		ListNode first = new ListNode(0);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(2);
		ListNode fourth = new ListNode(3);
		first.next = second;
		second.next = third;
		third.next = fourth;
		ListNode.printElement(first);
		ListNode newHead = revList(first);
		ListNode.printElement(newHead);
		ListNode reorderHead = ReorderList(first);
		ListNode.printElement(reorderHead);
	}
}