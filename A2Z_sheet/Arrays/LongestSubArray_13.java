//Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

public class LongestSubArray_13 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        System.out.println(longestSubArraySumK(arr,10));
    }

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
}
