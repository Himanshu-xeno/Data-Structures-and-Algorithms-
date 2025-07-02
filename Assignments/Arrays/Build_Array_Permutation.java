public class Build_Array_Permutation {
    public static void main(String[] args) {
        int[] ans1 = {0, 2, 1, 5, 3, 4};
        int[] answer = buildArrays(ans1); // fix here

        for (int ans : answer) {
            System.out.print(ans + " ");
        }
    }

    static int[] buildArrays(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
