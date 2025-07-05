//Finding the Union of Two sorted arrays - using HashSet 

import java.util.ArrayList;
import java.util.HashSet;

public class UnionTwoSortedArrays_HashSet {

  public static void main(String[] args) {
    int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

    int n = arr1.length;
    int m = arr2.length;

    ArrayList<Integer> result = FindUnion(arr1, arr2, n, m);

    System.out.println("Union of arr1 and arr2 is:");
    for (int num : result) {
      System.out.print(num + " ");
    }
  }

  // Function to find the union of two arrays
  static ArrayList<Integer> FindUnion(int arr1[], int[] arr2, int n, int m) {

    // Using HashSet to store only unique elements
    HashSet<Integer> set = new HashSet<>();

    // Add elements of first array to the set
    for (int i = 0; i < n; i++) {
      set.add(arr1[i]);
    }

    // Add elements of second array to the set
    for (int i = 0; i < m; i++) {
      set.add(arr2[i]);
    }

    // Store unique elements in the ArrayList
    ArrayList<Integer> unionList = new ArrayList<>(set);

    return unionList;
  }
}
