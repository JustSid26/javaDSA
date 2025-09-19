package sorting;
import java.util.*;

public class ArrayIO{
	public static void printElement(int nums[]){
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
	public static void input(int nums[]){
		Scanner o=new Scanner(System.in);
		for(int i = 0; i < nums.length; i++){
			nums[i]=o.nextInt();
		}
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if((m == 0 && n == 0) || n == 0) return;
        if(m == 0){
            for(int i = 0; i < nums2.length; i++)
            nums1[i] = nums2[i];
            return;
        }
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[i - nums2.length];
        }
        Arrays.sort(nums1);
    }
	public static void main(String args[]){
		int nums1[] = {0};
		int nums2[] = {1};
		printElement(nums1);
		printElement(nums2);
		merge(nums1, 0, nums2, 1);
		printElement(nums1);
	}
}