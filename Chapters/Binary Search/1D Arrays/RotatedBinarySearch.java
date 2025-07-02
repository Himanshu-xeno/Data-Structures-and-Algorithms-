public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 0, 1, 2, 3};
        System.out.println("Pivot index: " + findPivot(arr));
        int target = 2;
        System.out.println("Target found at index: " + search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If target is at pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //This won't work for the arrays with duplicate values.
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // case 3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }


    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // case 3
            //if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //Note : what if these elements at start and end were the pivots ?

                //check if the start is a pivot
                if (start < end && arr[end] < arr[mid - 1]) {
                    return mid - 1;
                }
                start++;

                //check if the end is a pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so the pivot should be in the right side
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
}
