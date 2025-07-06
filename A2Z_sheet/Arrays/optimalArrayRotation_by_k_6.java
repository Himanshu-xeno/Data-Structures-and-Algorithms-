//Left Rotation and Right rotation by K Elements : optimal approach

import java.util.Arrays;

public class optimalArrayRotation_by_k_6{
    public static void main(String[] args) {
        int[] leftArr = { 10, 20, 30, 40, 50 };
        int[] rightArr = { 10, 20, 30, 40, 50 };
        int k = 2;

        // Call optimal left rotation
        leftRotate(leftArr, k);
        System.out.println("Optimal Left Rotated Array: " + Arrays.toString(leftArr));

        // Call optimal right rotation
        rightRotate(rightArr, k);
        System.out.println("Optimal Right Rotated Array: " + Arrays.toString(rightArr));
    }

    // Optimal Left Rotate by K
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Optimal Right Rotate by K
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
    }

    // 🔄 Common Reverse Helper Function
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

