// ❓ Q: Concatenation of Array
// 🧠 Given an array `nums`, return an array `ans` where ans = nums + nums.
// 🧪 Example: nums = [1, 2, 1] → ans = [1, 2, 1, 1, 2, 1]
// 🔁 TC: O(n), 📦 SC: O(n)


import java.util.Arrays;

public class ConcatenationArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] getConcatenation(int[] nums){
        //Build a new array with double length of nums
        int[] ans = new int[2*nums.length];

        //using for loop fill each element space of new ans[]
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+ nums.length] = nums[i];
        }

        return ans;  //return the new created array ans
    }
}

//Note : iterate it upto the input array length only !!