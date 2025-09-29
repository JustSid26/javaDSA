package Queue;
import java.util.*;
class MyQueue {
	Stack<Integer> s1;
	Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
    	while(!s2.isEmpty())
    		s1.push(s2.pop());
    	s1.push(x);
    	while(!s1.isEmpty()){
    		s1.push(s2.pop());
    	}
    }
    
    public int pop() {
        return s2.pop();
    }
    
    public int peek() {
        return s2.peek();
    }
    
    public boolean empty() {
        return s2.isEmpty();
    }
}