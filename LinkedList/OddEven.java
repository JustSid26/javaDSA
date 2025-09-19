package LinkedList;

public class OddEven {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
        return head;
     }
     ListNode even = head.next;
     ListNode evenHead = even;
     ListNode odd = head;
     while(even!=null && even.next != null){
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;
     }
     odd.next = evenHead;
     return head;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        ListNode.printElement(a);
        ListNode newHead = oddEvenList(a);
        ListNode.printElement(newHead);
    }
}
