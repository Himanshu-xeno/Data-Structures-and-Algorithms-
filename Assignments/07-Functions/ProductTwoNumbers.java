//5. Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();

        int product = ProductOfTwoNumbers(num1,num2);
        System.out.println("Product of Two numbers : " + product);
    }

    static int ProductOfTwoNumbers(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
}
