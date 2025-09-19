package Arrays;

public class rotateArray {
    public static void roate(int nums[], int k){
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, nums.length - 1);
    }
    public static void swap(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
    public static void printElement(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String agrs[]){
        int num[] = {1,2,3,4,5,6,7};
        int k = 3;
        roate(num, k);
        printElement(num);
    }
}

