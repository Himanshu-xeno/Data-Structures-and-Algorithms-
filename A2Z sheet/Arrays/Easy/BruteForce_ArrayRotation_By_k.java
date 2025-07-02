//Left Rotation by K Elements : Brute-force approach

import java.util.Arrays;
public class BruteForce_ArrayRotation_By_k {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int k = 3;
        //leftRotate(arr,k,n);
        rightRotate(arr,k,n);
        //System.out.println("Left Rotated Array: " + Arrays.toString(arr));
        System.out.println("Right Rotated Array: " + Arrays.toString(arr));
    }

    static void leftRotate(int[] arr, int k, int n){
        k = k % n;
        int[] temp = new int[k];

        //copy the first k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        //shifting remaining elements
        for (int i = k; i <n ; i++) {
            arr[i-k] = arr[i];
        }

        //Add temp at the end
        for (int i = 0; i < k; i++) {
            arr[n-k+i] = temp[i];
        }
    }

    static void rightRotate(int[] arr, int k,int n) {
        k = k % n;
        int[] temp = new int[k];

        // Step 1: Copy last k elements
        for (int i = 0; i < k; i++)
            temp[i] = arr[n - k + i];

        // Step 2: Shift remaining elements to right
        for (int i = n - 1; i >= k; i--)
            arr[i] = arr[i - k];

        // Step 3: Place temp at start
        for (int i = 0; i < k; i++)
            arr[i] = temp[i];
    }

}
