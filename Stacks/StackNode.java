package Stacks;

public class StackNode {
    StackNode head;
    StackNode next;
    int val;
    public StackNode(){

    }
    public StackNode(int val, StackNode next){
        this.val = val; //class val = function val
        this.next = next;
    }
    public void push(int val){
        head = new StackNode(val, head);
    }
    public int pop(){
        if(!isEmpty()){
            int value = head.val;
            head = head.next;
            return value;
        }
        return Integer.MIN_VALUE; // or return -1; is fine
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int peek(){
        if(!isEmpty())
        return head.val;
        return Integer.MIN_VALUE;
    }
}
