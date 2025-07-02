public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] ans1 = {1, 2, 3, 4, 5, 6, 7};
        int[] concatenated = getConcatenation(ans1);

        for (int ans : concatenated) {
            System.out.print(ans + " "); 
        }
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];         // First half
            ans[i + nums.length] = nums[i]; // Second half
        }
        return ans;
    }
}
