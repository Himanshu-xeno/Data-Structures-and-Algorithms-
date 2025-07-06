//Left Rotate the Array by One

public class LeftRotateOne_5 {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {1,2,3,4,5};
        //rotateLeft(nums,n);
        solve(nums, n);
    }

    //BruteForce : using temp array
    static void rotateLeft(int[] nums, int n){
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i-1] = nums[i];
        }

        temp[n-1] = nums[0];

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    //Optimal : using temp variable
    static void solve(int[] nums, int n){
        int temp = nums[0];  //storing the 1st element in a temporary variable

        //shifting the elements to the left
        for (int i = 0; i < n -1; i++) {
            nums[i] = nums[i+1];
        }
        nums[n-1] = temp; //putting the extracted 1st element at the last place

        //print the newly rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}


