package Arrays;
public class removeDuplicates {
    public int removeElements(int[] nums){
        if(nums.length == 0)
        return 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[i]!=nums[j]){
                i++; //increase the count
                nums[i] = nums[j];
            }
        }
        printArray(nums);
        return i +1;
    }
    void printArray(int nums[]){
        for(int i  = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates obj = new removeDuplicates();
        int k = obj.removeElements(nums);
        System.out.println("Number of actual numbers = "+k);
    }
}
