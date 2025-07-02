//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of terms you want, n: ");
        int n = in.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");

        if (n >= 1) System.out.println(first);
        if (n >= 2) System.out.println(second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
