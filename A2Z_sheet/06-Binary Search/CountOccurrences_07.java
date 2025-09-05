/*
07. Count Occurrences in Sorted Array
 */

public class CountOccurrences_07 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 8, 8, 11, 13};
        int n = arr.length, x = 8;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }

    static int firstOccurrence(int[] arr, int n, int target) {
        int s = 0, e = n - 1;
        int ans = -1; // initially not found

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans = mid;     // candidate
                e = mid - 1;   // move left to find earlier occurrence
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int n, int target) {
        int s = 0, e = n - 1;
        int ans = -1; // initially not found

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans = mid;     // candidate
                s = mid + 1;   // move right to find later occurrence
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static int count(int[] arr, int n, int x) {
        int first = firstOccurrence(arr, n, x);
        if (first == -1) return 0; // element not present

        int last = lastOccurrence(arr, n, x);
        return (last - first + 1);
    }
}
