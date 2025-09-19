package LinkedList2;
public class ListNode{
	 static ListNode head;
	 ListNode next;
	public int val;

	public ListNode(){

	}
	public ListNode(int val){
		this.val = val;
	}

	public static void insertAtBeginning(ListNode newNode){
		if(head == null){
			head = newNode;
			return;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}
	public static void insertAtEnd(ListNode newNode){
		ListNode curr = head;
		while(curr.next!=null){
			curr = curr.next;
		}
		curr.next = newNode;
	}

	public static void printElement(ListNode head){
		ListNode curr = head;
		while(curr!=null){
			System.out.print(curr.val + "->");
			curr = curr.next;
		}
		System.out.print("null\n");
	}

	public static void main(String args[]){
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(20);
		ListNode c = new ListNode(100);
		a.next = b;
		b.next = c;
		head = a;
		ListNode newNode = new ListNode(69);
		printElement(head);
		insertAtBeginning(newNode);
		printElement(head);

		ListNode newNode2 = new ListNode(420);
		insertAtEnd(newNode2);
		printElement(head);
	}
}