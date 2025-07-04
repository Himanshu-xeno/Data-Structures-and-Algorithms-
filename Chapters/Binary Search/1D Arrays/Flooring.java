public class Flooring {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 14;
        int ans = flooringOfNumber(arr,target);
        System.out.println(ans);
    }

    static int flooringOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<= end){
            int mid = start + (end - start)/2;

            //Ascending formulas for start and end depending upon target and mid comparison
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return end;
    }

}
