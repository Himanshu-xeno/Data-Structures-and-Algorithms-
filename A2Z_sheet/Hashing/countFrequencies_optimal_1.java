//Given an array nums of size n which may contain duplicate elements,
//return a list of pairs where each pair contains a unique element
// from the array and its frequency in the array.
// Optimal approach

import java.util.*;

public class countFrequencies_optimal_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3, -5, -5, -5, 1000000};

        // Call function
        List<List<Integer>> freqList = countFrequencies(nums);

        // Print result
        System.out.println(freqList);
    }

    public static List<List<Integer>> countFrequencies(int[] nums) {
        // Use HashMap to store number and its count
        Map<Integer, Integer> map = new HashMap<>();

        // Count each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Make result list
        List<List<Integer>> result = new ArrayList<>();

        for (int key : map.keySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(key);           // Number
            pair.add(map.get(key));  // Frequency
            result.add(pair);
        }

        return result;
    }
}
