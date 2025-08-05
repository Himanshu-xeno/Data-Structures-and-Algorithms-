//7. Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to be checked: ");
        int num = in.nextInt();

        boolean result = checkPrime(num);
        System.out.println("Brute-force check: " + result);

        boolean prime = isPrime(num);
        System.out.println("Optimal check: " + prime);
    }

    // Brute-force
    static boolean checkPrime(int n){
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                count++;
            }
        }
        return count == 2;  // Exactly two factors → Prime
    }

    // Optimal way
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
