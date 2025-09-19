import java.util.*;
class ValidWordSubstitution{
	public static boolean isValid(String s){
		if(s.length() % 3 != 0)
			return false;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++){
			char currentChar = s.charAt(i);
			if(currentChar == 'c'){
				if(stack.size() >= 2 && stack.pop() == 'b' && stack.pop() == 'a'){
				continue;
				} else{
				return false;
			}
			}
			else{
				stack.push(currentChar);
			}
		}
		return stack.isEmpty();
	}
	public static void main(String args[]){
		String s = "abcabcababcc";
		System.out.println(isValid(s));
	}
}