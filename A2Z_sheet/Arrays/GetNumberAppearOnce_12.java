//Find number in array-> That appears once rest numbers appear twice

public class GetNumberAppearOnce_12 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(getSingleElement(arr));
        System.out.println(getSingleElementXOR(arr));
    }

    //brute-force approach
    //TC = O(N^2) → For each element, do a full scan to count frequency.
    //SC = O(1)
    static int getSingleElement(int[] arr) {
        // Loop to select each element one by one
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];  // Selected element
            int count = 0;     // Count of current element

            // Count how many times the selected element appears in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }

            // If the element appears only once, return it
            if (count == 1) return num;
        }
        return -1;
    }

    //Optimal approach
    //TC = O(N) , SC = O(1)
    static int getSingleElementXOR(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
}



