/*
Find target element in Mountain/Bitonic Array
Find in Order Agnostic Binary search
 */

public class TargetMountainArray_13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans); // Output should be 2 (index of 3 in the first increasing part)
    }

    static int search(int[] arr, int target) {
        int peak = peakIndex(arr);

        // Search in the ascending part
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // Search in the descending part
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    // Find peak index in the mountain array
    static int peakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; // move end left
            } else {
                start = mid + 1; // move start right
            }
        }
        return start;
    }

    // Order agnostic binary search, can work for ascending or descending sorted subarrays
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) { // Use <=, not <
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
