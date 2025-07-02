//Find Second Smallest and Second-Largest Element in an array

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1};
        System.out.println(findSecondLargest(nums));
    }

    static int findSecondLargest(int[] nums) {
        if(nums.length < 2){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];

            if(element > max){
                secondMax = max;
                max = element;
            }else if(element > secondMax && element !=  max){
                secondMax = element;
            }
        }

        if(secondMax == Integer.MIN_VALUE){
            return -1;  //No valid second-largest element found.
        }

        return secondMax;
    }
}
