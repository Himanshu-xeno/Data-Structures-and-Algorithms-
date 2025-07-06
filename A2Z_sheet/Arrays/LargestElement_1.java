//Find the Largest element in an array

public class LargestElement_1 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};
        System.out.println(largestElement(nums));
    }

    static int largestElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i <= nums.length -1 ; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
