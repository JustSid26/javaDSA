package Strings;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if(s.length() == 1 && t.length() == 1)
        return s.charAt(0) == t.charAt(0);
        if(s.length() != t.length())
        return false;
        int occurence[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            occurence[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            if(occurence[c - 'a'] == 0)
            return false;
            occurence[c-'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
