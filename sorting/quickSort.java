package sorting;

public class quickSort {

	public static int partition(int[] arr, int low, int high) {
		
		// Choose the middle element as pivot
		int pivot = arr[(low + high) / 2];
		int i = low - 1;
		int j = high + 1;

		while (true) {
			// Increment i while arr[i] < pivot
			do {
				i++;
			} while (arr[i] < pivot);

			// Decrement j while arr[j] > pivot
			do {
				j--;
			} while (arr[j] > pivot);

			// If pointers cross, return j
			if (i >= j)
				return j;

			// Swap arr[i] and arr[j]
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	// Main function to sort an array using QuickSort
	public static void sort(int[] arr, int low, int high) {
		if (low < high) {
			
			// pi is the partitioning index
			int pi = partition(arr, low, high);
			
			// Recursively sort elements before and after partition
			sort(arr, low, pi);
			sort(arr, pi + 1, high);
		}
	}

	// To print sorted array
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {10,8,12,1,4,6};
		int n = arr.length;

		printArr(arr);
		
		sort(arr, 0, n - 1);
		
		System.out.println("Sorted array:");
		printArr(arr);
	}
}