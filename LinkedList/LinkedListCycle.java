package LinkedList;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
        return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        
    }
}
