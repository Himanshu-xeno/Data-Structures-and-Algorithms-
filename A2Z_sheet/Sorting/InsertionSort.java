import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 45, 67};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i;

            //shifting the elements of sorted section to right to make space
            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
