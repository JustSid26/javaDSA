package Queue;
import java.util.*;
class MyStack{
	Queue<Integer> queue;
	public MyStack(){
		queue = new LinkedList<>();
	}
	public void push(int x){
		queue.add(x);
		int count = 0;
		while(count < queue.size()-1){
			queue.add(queue.remove());
			count++;
		}
	}
	public int pop(){
		return queue.remove();
	}
	public int top(){
		return queue.peek();
	}
	public boolean empty(){
		return queue.isEmpty();
	}
}