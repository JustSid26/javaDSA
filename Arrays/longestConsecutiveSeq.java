import java.util.Arrays;
import java.util.HashMap;

public class longestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);        
        // int flag = 0;
        // for(int i = 0; i < nums.length -1; i++){
        //     if(nums[i+1] -  nums[i] == 1){
        //         flag++;
        //     }
        // }
        if (nums.length == 0) return  0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0; int maxCount = 0;
        for(int num: nums){
            map.put(num,1);
        }
        for(int key : map.keySet()){
            if(!map.containsKey(key+1)){
                count = 1;
                while (map.containsKey(key-1)) {
                    count++;
                    key--;
                }
            }
            if(count > maxCount)
            maxCount = count;
        }
        return maxCount;
    }
}
