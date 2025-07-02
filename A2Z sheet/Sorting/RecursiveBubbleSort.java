import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        bubble(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int n){
        // Base case: If the array size is 1, it's sorted
        if (n == 1) {
            return;
        }

        // One pass of bubble sort. After this pass, the largest element is at the end.
        for (int j = 1; j < n; j++) {
//            if (arr[j] > arr[j - 1]) { // Descending order
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//            }

            if (arr[j] < arr[j - 1]) { // ascending order
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        //recursive call
        bubble(arr,n-1);
    }
}


//inorder to get this thing optimized
//use boolean swapped = false before the inner loop
//in inner loop : use swapped = true; after the the inner loop
//outside the inner loop : if(!swapped){ return ; }