// ❓ Q: Build Array from Permutation
// 🧠 Given 0-indexed array nums, build an array ans where ans[i] = nums[nums[i]].
// 🧪 Example: nums = [0,2,1,5,3,4] → ans = [0,1,2,4,5,3]
// 🔁 TC: O(n), 📦 SC: O(n)


import java.util.Arrays;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] result = buildArray(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] buildArray(int[] nums){
        //Build a new array with same length of nums
        int[] ans = new int[nums.length];

        //using for loop fill each element space of new ans[]
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;  //return the newly created ans[]
    }
}
