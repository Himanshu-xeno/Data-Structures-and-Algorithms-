//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].

import java.util.Arrays;

public class First_Last_position_10 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,7,8,8,9,10};
        int target = 7;
        int[] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result)); //use Arrays.toString to get the int[] printed.
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int n = nums.length;

        // find first occurrence
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                e = mid - 1; // search left
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        // find last occurrence
        s = 0; e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                s = mid + 1; // search right
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
}
