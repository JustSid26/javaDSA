package Strings;
public class IntegerToRoman{
    public static String intToRoman(int num) {
        String arr[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String s = "";
        while(num!=0){
            int n = 10*num/10;
            // System.out.println(n);
            if(n%1000 == 0){
                int count = n / 1000;
                // System.out.println(count);
                for(int i = 0; i < count; i++){
                    s = s.concat("M");
                    // System.out.println(s);
                }
                
            }
            if(n%500 == 0){
                
            }
            num/=10;
        }
        return s;
    }
    public static void main(String args[]){
        int num = 3000;
        System.out.println(intToRoman(num));
    }
}