//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }

    static int singleNumber(int[] nums) {
        int unique = 0;

        for(int i=0; i< nums.length; i++){
            unique = unique ^ nums[i];
        }

        return unique;
    }
}


/*
-> do XOR operation with another same array
-> Use a loop and iterate over the array
	Imp :  0 XOR unique = unique

unique = 0
unique ^= 4   → 0 ^ 4 = 4
unique ^= 1   → 4 ^ 1 = 5
unique ^= 2   → 5 ^ 2 = 7
unique ^= 1   → 7 ^ 1 = 6
unique ^= 2   → 6 ^ 2 = 4
 */