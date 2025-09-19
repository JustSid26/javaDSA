public class N_andDoubleExists{
	public static boolean checkIfExist(int[] arr) {
        if(arr.length == 2 && ((arr[0] == 2 * arr[1] ) ||
            (arr[1] == arr[0] * 2)))
            return true;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i!=j && arr[i] == arr[j] * 2) return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
    	int nums[] = {3,1,7,11};
    	System.out.println(checkIfExist(nums));
    }
}