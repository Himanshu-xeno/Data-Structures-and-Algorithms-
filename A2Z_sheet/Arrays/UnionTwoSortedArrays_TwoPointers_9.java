//Finding the Union of Two sorted arrays - using Two pointers

import java.util.ArrayList;

public class UnionTwoSortedArrays_TwoPointers_9 {

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        int n = arr1.length;
        int m = arr2.length;

        ArrayList<Integer> union = findUnion(arr1, arr2, n, m);

        System.out.println("Union of arr1 and arr2 is:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }

    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            // If both elements are equal
            if (arr1[i] == arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
                j++;
            }

            // arr1[i] < arr2[j]
            else if (arr1[i] < arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
            }

            // arr1[i] > arr2[j]
            else {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < n) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                unionList.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while (j < m) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;
        }

        return unionList;
    }
}
