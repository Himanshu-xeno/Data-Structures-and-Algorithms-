//Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

public class LongestSubArray_13 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        System.out.println(longestSubArraySumK(arr,10));
        System.out.println(longestSubArraySumK_optimal(arr,10));
    }

    //brute-force approach
    static int longestSubArraySumK(int[] arr,int k){
        int currentSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {      //Take one element at a time

            for (int j = i; j < arr.length; j++) {     //Add next element one by one
                currentSum = currentSum + arr[j];

                if(currentSum == k){            //if currentSum == sum (given)
                    int length = j-i+1;         //find the length of that subarray

                    if(length > maxLen) maxLen = length;    //If length of subarray > maxLen
                }                                          //It is the longest subarray

            }
        }
        return maxLen;
    }

    //optimal - using 2 pointers (Sliding Window)
    static int longestSubArraySumK_optimal(int[] arr, int k){
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLen = 0;

        while(right < arr.length){

            //if sum > k, reduce subarray from left
            //until sum <= k
            while (left<=right && sum>k){
                sum = sum - arr[left];
                left ++;
            }

            //if sum = k, update maxLen
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }

            //Move the right pointer forward
            right ++ ;
            if(right < arr.length){
                sum = sum + arr[right];
            }

        }
        return maxLen;
    }
}
