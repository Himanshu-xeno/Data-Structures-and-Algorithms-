/*  Sum Triangle from Array. - GFG
i/p : A = {1,2,3,4,5}
 o/p : [48]
       [20, 28]
       [8, 12, 16]
       [3, 5, 7, 9]
       [1, 2, 3, 4, 5]
=> Elements at level is to be sum of consecutive two elements in previous level. */

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printSumTriangle(arr);

    }

    static void printSumTriangle(int[] arr){

        //Base condition
        if(arr.length < 1){
            return;
        }

        //Creating new array which contains the Sum of consecutive elements in the array passes as parameter.
        int[] temp = new int[arr.length -1];

//        for (int i = 0; i < arr.length - 1; i++) {
//            temp[i] = arr[i] + arr[i+1];
//        }

        //WIthout using loop for element filling in temp array
        helper(temp, arr, 0);

        //Make a recursive call and pass the newly created array
        printSumTriangle(temp);

        //Print the current array in the end so that smaller arrays are printed first
        System.out.println(Arrays.toString(arr));
    }

    static int[] helper(int[] temp, int[] arr, int index){
        //Base condition
        if(index == arr.length - 1){
            return temp;
        }

        temp[index] = arr[index] + arr[index + 1];

        //Recursive call for helper() fn
        return helper(temp, arr, index + 1);
    }
}
