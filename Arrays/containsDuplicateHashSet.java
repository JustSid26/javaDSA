import java.util.HashSet;

public class containsDuplicateHashSet {
    public boolean containsDuplicate(int[] nums){
        if(nums.length == 1)
        return false;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
