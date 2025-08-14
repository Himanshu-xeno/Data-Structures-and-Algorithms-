// ❓ Q: Shuffle the Array
// 🧠 Given nums = [x1, x2, ..., xn, y1, y2, ..., yn], return [x1, y1, x2, y2, ..., xn, yn].
// 🧪 Example: nums = [2,5,1,3,4,7], n = 3 → [2,3,5,4,1,7]
// 🔁 TC: O(n), 📦 SC: O(n)


import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(nums1, 3)));

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(Arrays.toString(shuffle(nums2, 4)));

        int[] nums3 = {1, 1, 2, 2};
        System.out.println(Arrays.toString(shuffle(nums3, 2)));
    }

    static int[] shuffle(int[] nums, int n){
        int[] result = new int[2*n];
        int index = 0;

        // First half: nums[0] to nums[n-1]
        // Second half: nums[n] to nums[2n-1]
        for (int i = 0; i < n; i++) {
            result[index ++] = nums[i];
            result[index ++] = nums[i + n];
        }
        return result;
    }
}
