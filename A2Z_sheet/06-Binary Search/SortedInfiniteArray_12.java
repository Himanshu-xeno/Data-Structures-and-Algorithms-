/*
12) Find position of an element in a sorted array of infinite numbers
Given a sorted array arr[] of infinite numbers. The task is to search for an element k in the array.
 */

public class SortedInfiniteArray_12 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 90;
        int result = ans(arr, target);
        System.out.println(result);

    }

    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;

        //Check whether target is in range
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;  //search in right side
            }else if(target < arr[mid]){
                end = mid - 1;  //search in left side
            }else{
                return mid;  //found the target
            }
        }
        return -1;
    }
}
