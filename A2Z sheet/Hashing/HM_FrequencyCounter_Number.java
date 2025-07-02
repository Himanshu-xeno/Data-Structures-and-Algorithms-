import java.util.HashMap;
import java.util.Scanner;

public class HM_FrequencyCounter_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create an array to store input numbers
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Creating a HashMap to store frequency of numbers
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies using HashMap
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1); // Increment existing value
            } else {
                map.put(num, 1); // First time entry
            }
        }

        // Print the frequency of each number
        System.out.println("\nFrequencies of elements:");
        for (int key : map.keySet()) {
            System.out.println("Number " + key + " appears " + map.get(key) + " times");
        }
    }
}
