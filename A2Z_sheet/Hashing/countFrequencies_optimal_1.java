//Given an array nums of size n which may contain duplicate elements,
//return a list of pairs where each pair contains a unique element
// from the array and its frequency in the array.
// Optimal approach

import java.util.*;

public class countFrequencies_optimal_1 {
    public static void main(String[] args) {
        // Input array (can contain duplicates, negatives, or large numbers)
        int[] arr = {1, 2, 2, 1, 3, -5, -5, -5, 1000000};

        // Call the method to count frequencies
        List<List<Integer>> result = countFrequencies(arr);

        // Printing the result
        System.out.println(result);
    }

    // Method to return list of [value, frequency] pairs
    public static List<List<Integer>> countFrequencies(int[] arr) {
        // Step 1: Create a HashMap to store frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 2: Count frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Convert map entries to list of lists
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            List<Integer> pair = Arrays.asList(entry.getKey(), entry.getValue());
            result.add(pair);
        }

        return result;
    }
}