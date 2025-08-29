//2. Count the number of even and odd numbers in a list.

import java.util.*;

public class CountEvenOdd_2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 23, 42, 7);
        counting(numbers);
    }

    static void counting(List<Integer> numbers){
        int evenCount = 0, oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
