//mergeSort
import java.util.*;
public class sorting {
    public void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid +1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i  = low; i < high; i ++){
            arr[i] = temp.get(i-low);
        }
    }
    void mergeSort(int arr[], int low, int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }


    public int partition(int arr[], int low, int high){
        int pivot = arr[(low+high)/2];
        int i = low-1;
        int j = high +1;
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public void quickSort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi);
            quickSort(arr, pi+1, high);
        }
    }
}
