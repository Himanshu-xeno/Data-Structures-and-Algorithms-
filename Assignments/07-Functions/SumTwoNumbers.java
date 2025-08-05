//4. Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();

        int sum = sumOfTwoNumbers(num1,num2);
        System.out.println("Sum of Two numbers : " + sum);
    }

    static int sumOfTwoNumbers(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
