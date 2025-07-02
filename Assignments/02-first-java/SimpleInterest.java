//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount : ");
        int p = in.nextInt();

        System.out.print("Enter the interest rate (in %) : ");
        int r = in.nextInt();

        System.out.print("Enter the number of years : ");
        int n = in.nextInt();

        int simpleinterest = (p*n*r)/100;
        System.out.println("Simple Interest : " +simpleinterest);
    }
}
