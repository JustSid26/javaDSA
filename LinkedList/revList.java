class StackNode{
	public StackNode head = null;
	public StacKNode next;
	public int val;
	public StackNode(){

	}
	public StackNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
	public void push(int x){
		head = StackNode(x, head);
	}
	public boolean isEmpty(){
		return head == null;
	}
	public int pop(){
		if(isEmpty())
			return -1;
		int temp = head.val;
		head = head.next;
		return temp;
	}
	public int peek(){
		if(isEmpty())
			return -1;
		return head.val;
	}
}