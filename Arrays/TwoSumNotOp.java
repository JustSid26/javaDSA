package Arrays;

public class TwoSumNotOp{
    public static int[] twoSum(int[] nums, int target) {
        if(nums.length == 2 && (nums[0] + nums[1] == target))
        return new int[] {0,1};
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if ((nums[i]+nums[j] == target))
                    return new int[] {i,j};
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 10;
        int ans[] = twoSum(arr, target);
        if(ans.length == 0){
            System.out.println("Not present");
            return;
        }
        System.err.println(ans[0]+","+ans[1]);
    }
}
