import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,13,45,34,223,456,1};
        insertion(arr, 1, arr.length); // Start from index 1
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr, int i, int n){
        //Base case :
        if(i == n) return;

        int j = i;
        while (j > 0 && arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }

        insertion(arr, i + 1, n);
    }
}
