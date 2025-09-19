package LinkedList;

public class LinkedListCycle2 {
    public static ListNode hasCycle(ListNode head) {
        if(head == null || head.next == null)
        return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
               break;
            }
        }
        if(fast == null || fast.next == null)
        return null;
        while(slow != head){
            slow =slow.next;
            head = head.next;
        }
        return head;
    }
}
