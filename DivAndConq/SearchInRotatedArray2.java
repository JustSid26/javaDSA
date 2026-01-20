package DivAndConq;

public class SearchInRotatedArray2 {
    public boolean search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) return true;
        return BinarySearch(nums, target, 0, nums.length - 1);
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == target) return true;
        // }
        // return false;
    }
    public boolean BinarySearch(int nums[], int target, int start, int end){
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return true;
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                start++;
                end--;
            }
            else if(nums[mid] >= nums[start])
                if(target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            
            else{
                if(target <= nums[end] && target > nums[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            
        }
        return false;
    }
}
