// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = in.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();

        double result;

        if (op == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator! Please use +, -, *, or /.");
        }
    }
}
