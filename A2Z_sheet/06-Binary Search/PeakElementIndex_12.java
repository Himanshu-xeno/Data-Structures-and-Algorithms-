//12) Find Peak Element
//A peak element is an element that is strictly greater than its neighbors.
//Given a 0-indexed integer array nums, find a peak element, and return its index.
// If the array contains multiple peaks, return the index to any of the peaks.

public class PeakElementIndex_12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int result = peakIndex(arr);
        System.out.println(result);
    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){   //Change from <= to <
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;  // Peak is at mid or left
            }else{
                start = mid + 1;    // Peak is to the right
            }
        }
        return start; //or return end, they are equal
    }
}
