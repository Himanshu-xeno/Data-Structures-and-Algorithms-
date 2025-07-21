public class SortedRotatedArray_3 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(check(nums));
    }

    static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with next (circular using %)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1; // Only one rotation break allowed
    }
}

//TC = O(N) => it traverses once through the array
//SC = O(1) =>  Uses only a counter — no extra space used
