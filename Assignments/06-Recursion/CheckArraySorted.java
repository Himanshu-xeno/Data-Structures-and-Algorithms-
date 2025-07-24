//Check if an Array is sorted or not ?
//Two approaches : iterative appraoch and recursive approach

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,4,5,6};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1 ; j++) {
                if(arr[j] < arr[i]) return false;
            }
        }
        return true;
    }
}
