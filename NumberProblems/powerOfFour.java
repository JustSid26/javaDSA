
class powerOfFour{
    static boolean isPowerOfFour(int n){
        while(n!=1){
            if(n%4 != 0)
            return false;
            n/=4;
        }
        return true;
    }
    public static void main(){
        boolean ans = isPowerOfFour(64);
        System.out.println(ans);
    }
}