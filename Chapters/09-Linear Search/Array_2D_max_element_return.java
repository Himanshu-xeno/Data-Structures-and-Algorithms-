import java.util.Arrays;

public class Array_2D_max_element_return {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 3, 45, 66},
                {23, 45, 67}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                     max= arr[row][col];
                }
            }
        }
        return max;
    }
}
