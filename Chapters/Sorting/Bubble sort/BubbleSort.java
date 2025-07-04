import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {34, 56, 11, 34, 669, 23, 2 , 0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if ( arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means that the array is sorted and hence stop the swapping.
            if(!swapped ){  // !false = true
                break;
            }
        }
    }
}
