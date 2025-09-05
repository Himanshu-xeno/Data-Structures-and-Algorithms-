/*
06. Find Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order,
find the ending position of a given target value.
If target is not found in the array, return -1.
 */

public class LastOccurrence_06 {
    public static void main(String[] args) {
        int[] arr = {3,4,13,20,20,20,40};
        int n = 7; int target = 29;
        int result = last(arr,n,target);
        System.out.println(result);
    }

    static int last(int[] arr, int n, int target){
        int s = 0, e = arr.length-1;
        int ans = n;

        while( s <= e){
            int mid = s + (e-s)/2;

            if (arr[mid] == target) {
                ans = mid;       // candidate
                s = mid + 1;     // move right to find last
            } else if (arr[mid] > target) {
                e = mid - 1;     // move left
            } else {
                s = mid + 1;     // move right
            }
        }
        return -1;  //If no element is found will return this only
    }
}
