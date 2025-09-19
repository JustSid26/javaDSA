package LinkedList;
public class MergeTwoSortedLists{
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null && l2 == null) return null;
		if(l1== null) return l2;
		if(l2 == null) return l1;

		ListNode head = null;
		if(l1.val < l2.val){
			head = l1;
			l1 = l1.next;
		}else{
			head = l2;
			l2 = l2.next;
		}
		ListNode curr = head;
		while(l1 != null && l2 != null){
			if(l1.val<l2.val){
				curr.next = l1;
				l1 = l1.next;
			}else{
				curr.next = l2;
				l2 = l2.next;
			}
			curr = curr.next;
		}
		if(l1 == null) curr.next = l2;
		else curr.next = l1;
		return head;
	}
	public static void main(String args[]){
		System.out.println("Helllo worlddd");
		ListNode list1 = new ListNode(1);
		ListNode num1 = new ListNode(3);
		ListNode num2 = new ListNode(5);
		list1.next = num1;
		num1.next = num2;
		ListNode.printElement(list1);

		ListNode list2 = new ListNode(2);
		ListNode num3 = new ListNode(4);
		ListNode num4 = new ListNode(6);
		list2.next = num3;
		num3.next = num4;
		ListNode.printElement(list2);

		ListNode newHead = mergeTwoLists(list1, list2);
		ListNode.printElement(newHead);
	}
}