public class FindMaxConsecutiveOnes_11 {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1, 1 };
        System.out.println(findMax(nums));
    }

    static int findMax(int nums[] ){
        int count = 0;
        int max_count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count ++;
            }else{
            count = 0;
            }

            max_count = Math.max(max_count, count);
            //if (count > max_count) {
            //    max_count = count;
            //}
        }
        return max_count;
    }
}

//TC = O(N) => it has just a single pass
//SC = O(1) => No extra space used