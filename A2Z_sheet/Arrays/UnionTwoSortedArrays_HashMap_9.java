//Finding the Union of Two sorted arrays - using HashMap

import java.util.ArrayList;
import java.util.HashMap;

public class UnionTwoSortedArrays_HashMap_9 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> result = FindUnion(arr1, arr2, n, m);

        // The method toString(long[]) in the type Arrays is not applicable for the
        // arguments (ArrayList<Integer>)
        System.out.println("Union of arr1 and arr2 is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Function to find the union of two arrays
    static ArrayList<Integer> FindUnion(int arr1[], int[] arr2, int n, int m) {

        // Using HashMap to store unique elements from both arrays
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Add elements of first array to the map
        for (int i = 0; i < n; i++) {
            freq.put(arr1[i], 1); // 1 is just a dummy value
        }

        // Add elements of second array to the map
        for (int i = 0; i < m; i++) {
            freq.put(arr2[i], 1); // if element already exists, it will not be duplicated
        }

        // Storing the unique elements in the ArrayList
        ArrayList<Integer> unionList = new ArrayList<>();
        for (int key : freq.keySet()) {
            unionList.add(key);
        }
        return unionList;
    }
}


//TC = O(m+n) => average case
//worst case = > TC = O((n+m)*log(n+m))

//SC : O(m+n) => if union Arraylist is consider
//SC : O(1) => if not considered