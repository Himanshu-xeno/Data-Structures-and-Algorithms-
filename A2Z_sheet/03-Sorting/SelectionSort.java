import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {34,56,34,122};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;

            //finding the max element in remaining unsorted elements
            int maxIndex = getMaxIndex(arr, 0 , last);
            swap(arr, maxIndex, last);
        }
    }

    //Getting the max element index in the unsorted array region - it excludes the last index of array.
    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    //swapping the two selected elements
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
