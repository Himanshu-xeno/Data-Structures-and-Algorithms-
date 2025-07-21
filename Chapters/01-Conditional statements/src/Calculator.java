import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the operator (+, -, *, /, %): ");
        char op = in.next().charAt(0);

        System.out.print("Enter the two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int ans = 0;

        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            if (op == '+') {
                ans = num1 + num2;
            } else if (op == '-') {
                ans = num1 - num2;
            } else if (op == '*') {
                ans = num1 * num2;
            } else if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return; // Exit the program
                }
            } else if (op == '%') {
                if (num2 != 0) {
                    ans = num1 % num2;
                } else {
                    System.out.println("Modulo by zero is not allowed.");
                    return; // Exit the program
                }
            }
            System.out.println("The result is: " + ans);
        } else {
            System.out.println("Invalid operator!");
        }
    }
}
