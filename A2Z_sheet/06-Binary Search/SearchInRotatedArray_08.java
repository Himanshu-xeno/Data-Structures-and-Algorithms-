//08. Search in rotated array

public class SearchInRotatedArray_08 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,45,55,66,666,4555};
        int target = 3;
        int ans = search(arr, target);
        System.out.println("The index of target element is : " + ans);
    }

    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target)
                return mid;

            //if left side is sorted
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target< nums[mid]){
                    end = mid - 1; //left search
                }else{
                    start = mid + 1;
                }
            }

            //Right side is sorted
            else{
                if(nums[mid] < target && target<= nums[mid]){
                    start = mid + 1; //right search
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;  //Not found
    }
}
