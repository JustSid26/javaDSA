package LinkedList;
public class RemoveDuplicates {
    public static ListNode deleteDuplicates(ListNode head){
        if(head == null || head.next == null)
        return head;
        ListNode curr = head;
        while(curr.next != null){
            if((curr.val == curr.next.val) && curr.next.next!=null){
                curr.next = curr.next.next;
            }else if(curr.next.next == null){
                curr.next = null;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ListNode.printElement(a);
        ListNode newHead = deleteDuplicates(a);
        ListNode.printElement(newHead);
    }
}
