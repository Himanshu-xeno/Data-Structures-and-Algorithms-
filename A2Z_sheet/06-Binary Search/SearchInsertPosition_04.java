//4. Given a sorted array of distinct integers and a target value,
// return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.

public class SearchInsertPosition_04 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,64,555};
        int n = 7; int x = 3;
        System.out.println(findBoundBrute(arr,n,x));
        int result = findBoundOptimal(arr,n,x);
        System.out.println(result);
    }

    //This problem is a classic application of Lower bound algo

    static int findBoundBrute(int[] arr, int n, int x){
        for (int i = 0; i < n; i++) {
            if(arr[i] >= x) {
                return i;   //lower bound
            }
        }
        return n;
    }

    static int findBoundOptimal(int[] arr, int n, int x){
        int s = 0, e = arr.length-1;
        int ans = n; //If no element is found will return this only

        while( s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] >= x){
                ans = mid;      //it can be ans as arr[mid] >= x is fulfilled
                e = mid - 1;    //search in left
            }else{
                s = mid + 1;    //search in right
            }
        }
        return ans;
    }
}
