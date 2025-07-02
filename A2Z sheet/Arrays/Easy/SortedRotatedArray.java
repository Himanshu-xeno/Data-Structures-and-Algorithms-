//1752. Check if Array Is Sorted

public class SortedRotatedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        check(nums);
        System.out.println(check(nums));
    }

    static boolean check(int[] nums) {
        for (int i = 0; i < nums.length -1; i++) {
            if(nums[i] < nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
