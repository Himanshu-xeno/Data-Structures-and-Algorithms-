import java.lang.reflect.Array;
import java.util.Arrays;
public class DynamicArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9,10,11,12,13}
        };

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println( );
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
