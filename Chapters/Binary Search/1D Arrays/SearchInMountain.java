public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1}; // mountain array
        int target = 3;

        int ans = search(arr, target); // calling the full mountain search
        System.out.println(ans);
    }

    // Full search method
    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry; // found in first half (ascending)
        }

        // Try in second half (descending)
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    // Find peak of mountain array
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid; // You're in decreasing part
            } else {
                start = mid + 1; // You're in increasing part
            }
        }
        return start; // Peak index
    }

    // Order-Agnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
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

        return -1; // target not found
    }
}
