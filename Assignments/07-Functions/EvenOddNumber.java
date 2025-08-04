//2. Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find even/odd: ");
        int num = sc.nextInt();

        // Call and print the result
        System.out.println(findOddEven(num));

        sc.close(); // Optional but good practice
    }

    // Return a string result instead of void
    static String findOddEven(int num) {
        if (num % 2 == 0) {
            return "It is an even number";
        } else {
            return "It is an odd number";
        }
    }
}

//For void return : just write findOddEven(num)
//Get the answer !!