package LinkedList;

public class merge {
    public static ListNode tryingMerge(ListNode list1, ListNode list2){
        ListNode curr = list1;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = list2;
        return list1;
    }
    public static void main(String args[]){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);

        a.next = b;
        b.next = c;
        ListNode.printElement(a);
        d.next = e;
        e.next = f;
        ListNode.printElement(d);
        ListNode newHead = tryingMerge(a, d);
        ListNode.printElement(newHead);
    }
}
