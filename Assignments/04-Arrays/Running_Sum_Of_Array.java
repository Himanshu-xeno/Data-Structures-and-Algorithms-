import java.util.Arrays;

public class Running_Sum_Of_Array {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1]; // Cumulatively add previous sum
        }
        return nums;
    }
}
