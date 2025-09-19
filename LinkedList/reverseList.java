package LinkedList;

public class reverseList {
    //Reversing the linkedlist
    public static ListNode reverseLinkedList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
