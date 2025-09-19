import java.util.*;
class quickSort{
	public static int partition(int nums[], int left, int right){
		int pivot = nums[left - (right - left)/2];
		int i = left -1;
		int j = right +1;
		while(true){

			do{
				i++;
			}while(nums[i] < pivot);

			do{
				j--;
			}
			while(nums[j] > pivot);

			if(i >= j) return j;

			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
	public static void sort(int nums[], int left, int right){
		int pi = partition(nums, left, right);
		quickSort(nums, low, pi);
		quickSort(nums, pi+1, right);
	}
	public static void printElement(int nums[]){
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int nums[] = {4,1,6,8,10};
	}
}