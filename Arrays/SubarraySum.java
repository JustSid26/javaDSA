import java.util.HashMap;
/*
 * 
Topics
premium lock icon
Companies
Hint
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 1
*/
public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        if(nums.length == 1 && nums[0] == k)
        return 1;
        HashMap<Integer, Integer> map  = new HashMap<>();
        map.put(0, 1);
        int sum  = 0;
        int count=0;
        for(int num: nums){
            sum+=num;
            if(map.containsKey(sum - k))
                count+=map.get(sum-k);
            
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,0,3};
        System.out.println(subarraySum(nums, 3));
    }
}
