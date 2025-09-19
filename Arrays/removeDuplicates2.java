package Arrays;

public class removeDuplicates2 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 2)
        return 2;
        int i = 2;
        for(int j = 2; j < nums.length; j++){
            if(nums[j]  != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        printArray(nums);
        return i;
    }
    static void printArray(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println();
    }
    public static void main(String argsp[]){
        int nums1[] = {0,0,1,1,1,1,2,3,3};
        int nums2[] = {1,1,1,2,2,3};
        printArray(nums1);
        System.out.println(removeDuplicates(nums1));
        printArray(nums2);
        System.out.println(removeDuplicates(nums2));
    }
}
