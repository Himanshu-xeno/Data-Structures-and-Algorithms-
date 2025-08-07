// ❓ Q: Running Sum of 1d Array
// 🧠 Given an array nums, return the running sum: ans[i] = sum of nums[0..i].
// 🧪 Example: nums = [1,2,3,4] → ans = [1,3,6,10]
// Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// 🔁 TC: O(n), 📦 SC: O(1) (in-place) or O(n) (if new array)

import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = run(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] run(int[] nums){
        //iterate throughout the i/p array
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        return nums; //return the i/p array itself
    }
}

//since we are considering one element backward,
//keep it in mind to start iterating  element 1 and not from zero