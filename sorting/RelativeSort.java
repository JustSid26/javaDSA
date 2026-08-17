package sorting;

public class RelativeSort {
    public static int[] relativeSortArray(int arr1[], int arr2[]){
        int max = arr1[0];
        for(int num : arr1){
            if(max < num) max = num;
        }
        int count[] = new int[max+1];
        int output[] = new int[arr1.length];

        for(int num : arr1)
            count[num]++;

        int index = 0;
        for(int num : arr2){
            while(count[index] > 0){
                output[index++] = num;
                count[num]--;
            }
        }
        for(int i = 0;  i <= max; i++){
            while(count[i] > 0){
                output[index] = i;
                count[i]--;
            }
        }
        System.arraycopy(output, 0, arr1, 0, arr1.length);
        return output;
    }

    static void printArray(int arr[]){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String args[]){
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        System.out.println("Original Array1 = ");
        printArray(arr1);
        System.out.println("\nOriginal Array2 = ");
        printArray(arr1);
        System.out.println("\nOutput Array = ");
        int arr[] = relativeSortArray(arr1, arr2);
        printArray(arr);
        
    }
}
