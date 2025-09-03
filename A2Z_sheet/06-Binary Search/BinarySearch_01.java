//1. Binary Search to find X in sorted array

public class BinarySearch_01 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,45,55,66,666,4555};
        int target = 4555;
        int ans = searc(arr, target);
        System.out.println("The index of target element is : " + ans);
    }

    static int searc(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;  //because we are considering the index of array

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
