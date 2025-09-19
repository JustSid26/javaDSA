package Queue;
class MyQueue {
	Stack<Integer> stack1;
	Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new LinkedList<>();
        satck2 = new LinkedList<>();
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