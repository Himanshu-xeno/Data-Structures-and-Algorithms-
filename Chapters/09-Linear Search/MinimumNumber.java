import java.util.Arrays;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
}
