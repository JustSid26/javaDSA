package LinkedList;
public class deleteNode {
    //delete first node
    public static ListNode deleteStart(ListNode head){
        if(head == null){
            return head;
        }
        return head.next;
    }

    //delete last element
    public static ListNode deleteEnd(ListNode head){
        if(head == null|| head.next == null){
            return null;
        }
        ListNode curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    //delete at position
    public static ListNode deleteBetween(ListNode head,int position){
        if(head == null){
            return head;
        }
        ListNode curr = head;       
        int count = 1;
    
        while(curr.next != null && count<position){
            curr = curr.next;
            count++;
        }
        if(curr.next!=null){
            curr.next = curr.next.next;
        }
        return head;
    } 
}
