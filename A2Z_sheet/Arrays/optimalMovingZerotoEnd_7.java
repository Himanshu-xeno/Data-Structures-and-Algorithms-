//You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.
//Optimal-approach

import java.util.Arrays;

public class optimalMovingZerotoEnd_7 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 4, 5, 0, 2, 9, 0, 2, 0 };
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeros(int[] arr) {
        int j = -1;

        // step1: Find the first occurence of zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zeros are found, the array is fine already
        if (j == -1)
            return;

        // Step2 : Swap non-zero elements with zero at j
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}