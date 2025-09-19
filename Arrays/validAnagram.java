public class validAnagram{
	public boolean binarySearch(int nums[], int value){
		int left = 0;
		int right = nums.length-1;
		while(left <= right){
			int mid = left + (right - left) / 2;
			if(nums[mid] == value){
				return true;
			}if(nums[mid] < value){
				left = mid +1;
			}else{
				right  = mid -1;
			}
		}
		return false;
	}
	public static void main(String args[]){
		int nums[] = {1,4,6,10,11};
		int target =1;
		validAnagram obj = new validAnagram();
		System.out.println(obj.binarySearch(nums, target));
	}
}