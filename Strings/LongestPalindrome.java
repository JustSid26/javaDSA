package Strings;
public class LongestPalindrome{
	static int lowIndex, maxLength;
	public static String longestPalindrome(String s){
		if(s.length() == 1) return s;
		for(int i = 0; i < s.length(); i++){
			expandString(s, i, i);
			expandString(s, i, i+1);
		}
		return s.substring(lowIndex, lowIndex + maxLength);
	}
	public static void expandString(String s, int left, int right){
		int temp = 0;
		while(left>=0 && right < s.length()
			&&s.charAt(left) == s.charAt(right)){
			if(left == right) temp++;
			else temp+=2;
			left--;
			right++;
		}
		if(maxLength < temp){
			lowIndex = left+1;
			maxLength = temp;
		}
	}
	public static void main(String args[]){
		String s = "babad";
		String newString = longestPalindrome(s);
		System.out.println(newString);
	}
}




// //Structure1:
// if(!isEmpty()){
// 	return head.val;
// }
// return -1;


// //Structure2:
// if(!isEmpty()) return head.val;
// return -1;
