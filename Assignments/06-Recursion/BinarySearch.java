public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 3;
//        int ans = findTargert(arr,target);
        int ans = findOptimalTarget(arr,3,0,arr.length-1);
        System.out.println(ans);
    }

    //Brute-force approach
    static int findTargert(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end- start)/2;

            if(target < arr[mid]){
                end = mid -1;       //left search
            }else if(target > arr[mid]){
                start = mid + 1;    //right search
            }else{
                return mid;         //Found element
            }
        }
        return -1;
    }

    //Optimal way - recursion way
    static int findOptimalTarget(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end- start)/2;

        if(target == arr[mid]){
            return mid;     //found element
        }

        if(target < arr[mid]){
            return findOptimalTarget(arr, target, start, mid - 1);  //left search
        } else {
            return findOptimalTarget(arr, target, mid + 1, end);  //right search
        }
    }
}
