import java.util.Scanner;

public class SpecificNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input = "";

        System.out.println("Enter numbers to sum. Type 'x' to stop:");

        while (!input.equals("x")) {
            input = scanner.next();

            if (!input.equals("x")) {
                int number = Integer.parseInt(input);
                sum += number;
            }
        }
        System.out.println("Total Sum: " + sum);
    }
}
