//Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

import java.util.HashMap;

public class LongestSubArray_13 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        System.out.println(longestSubArraySumK(arr,10));
        System.out.println(longestSubArraySumK_optimal(arr,10));
        System.out.println(longestSubArraySumK_Hash(arr,10));
    }

    // Brute-force approach
    static int longestSubArraySumK(int[] arr, int k) {
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {  // Take one element at a time
            int currentSum = 0;  // Reset currentSum for each subarray starting at index i

            for (int j = i; j < arr.length; j++) {  // Add next element one by one
                currentSum += arr[j];

                if (currentSum == k) {  // If currentSum == sum (given)
                    int length = j - i + 1;  // Find the length of that subarray
                    if (length > maxLen) {
                        maxLen = length;  // If length of subarray > maxLen
                    }
                }
            }
        }
        return maxLen;
    }


//TC : O(N^2) => outer loop runs 'n' times and for each i => inner loop runs (n-i) times
//SC : O(1)

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

//TC : O(2*N)  -> As, left and right moves from 1 to N-1 : O(N)+O(N)
//SC : O(1)


    //optimal : using prefix sum and hashmap {For any ' +/- k '}
    static int longestSubArraySumK_Hash(int[] arr, int k) {
        // Initialize variables
        int currentSum = 0;  // Stores the cumulative sum
        int maxLen = 0;      // Stores the length of the longest subarray found
        HashMap<Integer, Integer> sumMap = new HashMap<>(); // To store cumulative sum and their indices
        sumMap.put(0, -1);  // For the case when subarray starts from index 0

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Update the cumulative sum
            currentSum += arr[i];

            // Check if currentSum - k exists in sumMap
            if (sumMap.containsKey(currentSum - k)) {
                // If exists, update maxLen
                maxLen = Math.max(maxLen, i - sumMap.get(currentSum - k));
            }

            // Store currentSum with its index in the hashmap
            // We store the first occurrence of the sum
            if (!sumMap.containsKey(currentSum)) {
                sumMap.put(currentSum, i);
            }
        }

        return maxLen;
    }
}

//TC : O(N) => Each element is visited once, All HashMap operations (put, get, containsKey) are O(1) average case
//SC : O(N) => In the worst case, the HashMap stores N different prefix sums

