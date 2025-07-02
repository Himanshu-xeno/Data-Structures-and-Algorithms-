import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = in.nextInt();

        System.out.print("Enter the number of columns : ");
        int columns = in.nextInt();

        System.out.println("Enter the elements for the 2D array: ");

        int[][] arr = new int[rows][columns];

        for(int row=0; row< arr.length; row++){
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = in.nextInt();
        }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println( );
        }

//        for(int[] a : arr){
//            System.out.println(Arrays.toString(a));
//        }
    }
}
