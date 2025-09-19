package LinkedList;
public class ListNode {
    public int val;
    public ListNode next;
    static ListNode head;

    public ListNode(){
    
    }

    public ListNode(int val){
        this.val = val;
    }

    public static void insertAtBeginning(ListNode newNode){
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void insertAtEnd(ListNode newNode){
        ListNode curr = head;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

//Printing LinkedList
    public static void printElement(ListNode head){
        ListNode curr = head;
        
        while(curr != null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String args[]){
        ListNode a =new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        head = a;
        ListNode c = new ListNode(10);
        ListNode d = new ListNode(11);
        printElement(a);
        insertAtBeginning(c);
        printElement(head);
        insertAtEnd(d);
        printElement(head);
    }
}