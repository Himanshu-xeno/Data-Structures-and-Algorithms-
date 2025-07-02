//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class InputLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, max = Integer.MIN_VALUE;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + max);
        }
    }
}
