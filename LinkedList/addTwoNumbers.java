package LinkedList;
public class addTwoNumbers {
    public ListNode add(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int sum,carry = 0;

        while(l1 !=null || l2 !=null){
           int p =l1 == null? 0:l1.val;
           int q =l2 == null? 0:l2.val;

           sum = p + q + carry;
           carry=sum/10;
           curr.next = new ListNode(sum % 10);
           curr = curr.next;

           l1=l1 ==null? null:l1.next;
           l2=l2 ==null? null:l2.next;
        }
        if(carry>0){
            curr.next = new ListNode(1);
        }
        System.out.println("Addition of Two Numbers");
        return dummy.next;
    }
}