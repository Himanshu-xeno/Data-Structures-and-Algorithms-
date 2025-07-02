//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;
public class SubtractionProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int sum = 0;
        int product = 1;

        while(num >0){
            int digits = num % 10;
            sum+=digits;
            product*=digits;
            num/=10;
        }

        System.out.println("Sum of digits = " +sum);
        System.out.println("Product of digits = " +product);
        System.out.println("Subtraction of product of digit and sum of digits = " +(product - sum));

    }
}
