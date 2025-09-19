package sorting;
import java.util.*;
public class MergeSort{
	public static void merge(int arr[], int low, int mid, int high){
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;      // Starting index of the left sub-array
        int right = mid + 1; // Starting index of the right sub-array
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

	}
	public static void mergeSort(int arr[], int low, int high){
		if(low>=high) return;
		int mid = (low+high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	public static void main(String args[]){
		int arr[] = {9,4,7,4,9,6,5,0,3,9};
		System.out.println("array = ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		mergeSort(arr, 0, arr.length-1);
		System.out.println("Sorted array = ");
		for(int i  = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}