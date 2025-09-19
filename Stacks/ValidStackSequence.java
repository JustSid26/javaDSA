package Stacks;
import java.util.*;
public class ValidStackSequence {
    public static boolean validateStackSequence (int[]pushed, int[] popped){
        if(pushed.length == 1){
            return pushed[0] == popped[0];
        }
        int poppedIndex = 0;
        Stack<Integer> stack = new Stack<>();
        for(int element: pushed){
            stack.push(element);
            while(!stack.isEmpty() && stack.peek() == popped[poppedIndex]){
                stack.pop();
                poppedIndex++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        int pushed[] = {1,2,3,4,5};
        int popped[] = {5,4,3,2,1};
        System.out.println(validateStackSequence(pushed, popped));
    }
}
