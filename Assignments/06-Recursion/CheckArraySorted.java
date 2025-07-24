//Check if an Array is sorted or not ?
//Two approaches : iterative appraoch and recursive approach

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,4,5,6};
        System.out.println(isSorted(arr));           // nested loop version
        System.out.println(isSortedOneLoop(arr));    // one-loop version
        System.out.println(isSortedRecursive(arr, 0)); // recursive version
        }

    //iterative : using 2 pointers    tc=O(n^2), sc=O(1)
    static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1 ; j++) {
                if(arr[j] < arr[i]) return false;
            }
        }
        return true;
    }

    //iterative : using one loop itself    tc=O(n), sc=O(1)
    static boolean isSortedOneLoop(int[] arr){
        for (int i = 1; i < arr.length - 1 ; i++) {
            if(arr[i] < arr[i-1]) return false;
        }
        return true;
    }

    //Recursive approach        tc=O(n), sc=O(n)
    static boolean isSortedRecursive(int[] arr, int index) {
        // Base case: If we reach the last element, it's sorted
        if (index == arr.length - 1) return true;

        // If current element is greater than the next, it's not sorted
        if (arr[index] > arr[index + 1]) return false;

        // Recursive call for next pair
        return isSortedRecursive(arr, index + 1);
    }
}
