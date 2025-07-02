 import java.util.Scanner;

    public class Reverse {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter the number: ");
            int num = in.nextInt();
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;       // Get the last digit
                reversed = reversed * 10 + digit; // Build the reversed number
                num = num / 10;             // Remove the last digit
            }

            System.out.print("Reversed number: " + reversed);
        }
    }


