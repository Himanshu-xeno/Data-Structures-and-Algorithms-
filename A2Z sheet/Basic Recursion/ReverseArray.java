public class ReverseArray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr, 0,n-1);
        printArray(arr, n);
    }

    //Function to print array
    static void printArray(int ans[], int n){
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i] + " ");
        }
    }
   /* //approach1: Using an extra array
    //using an auxiliary array
    static void reverseArray(int arr[], int n){
        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i--) {
            ans[n-1-i] = arr[i];
        }
        printArray(ans,n);
    } */

    /* //approach2 : space-optimized iterative method
    //using a single array
    static void reverseArray(int arr[], int n){
        int p1 = 0;
        int p2 = n -1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        printArray(arr, n);
    }  */

    //approach-3 : recursive method
    //using recursion
    static void reverseArray(int arr[], int start, int end){
        if (start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }


}
