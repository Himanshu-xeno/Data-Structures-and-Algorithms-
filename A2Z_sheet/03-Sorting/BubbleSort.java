import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 34, 56, 11, 34, 232, 444, 2 };
        bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int n) {
        for (int i = 0; i < n; i++) {

            // One pass of bubble sort. After this pass, the largest element is at the end.
            // arr[j] -> 2nd element
            // arr[j-1] -> 1st element
            for (int j = 1; j < n; j++) {
                // if (arr[j] > arr[j - 1]) { // Descending order (left < right)
                // int temp = arr[j];
                // arr[j] = arr[j - 1];
                // arr[j - 1] = temp;
                // }

                if (arr[j] < arr[j - 1]) { // ascending order (left > right)
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
