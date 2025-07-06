//Remove Duplicates in-place from Sorted Array
import java.util.HashSet;

public class RemoveDuplicates_4 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        // int k = removeDuplicates(arr);
        int k = removeDuplicates2(arr);

        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Bruteforce : Hashsets
    static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }

    // Optimal : Two pointers
    static int removeDuplicates2(int[] arr) {
        if (arr.length == 0) return 0; // Handle empty array case

        int i = 0; // Pointer for the unique elements
        for (int j = 1; j < arr.length; j++) { // Pointer for iterating through the array
            if (arr[i] != arr[j]) { // If a new unique element is found
                i++; // Move the unique element pointer
                arr[i] = arr[j]; // Place the unique element at the next available position
            }
        }
        return i + 1; // The number of unique elements is i + 1 (since i is 0-indexed)
    }
}