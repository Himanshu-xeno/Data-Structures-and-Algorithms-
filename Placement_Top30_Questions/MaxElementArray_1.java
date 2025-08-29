//1. Find the maximum element in an array.

public class MaxElementArray_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,33,12,34,45, 1};
        int ans = maxElement(arr);
        System.out.println(ans);

    }

    static int maxElement(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
