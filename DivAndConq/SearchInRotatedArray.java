package DivAndConq;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) return 0;
        return BinarySearch(nums, target, 0, nums.length - 1);
    }
    public int BinarySearch(int nums[], int target, int start, int end){
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] >= nums[start])
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
        return -1;
    }
}

