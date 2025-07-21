//Find the divisors of number n. - Optimal approach

import java.util.ArrayList;

public class Divisor_Optimal {

    public static ArrayList<Integer> findDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i); // i is a divisor

                if (i != n / i) {
                    divisors.add(n / i); // add the pair divisor
                }
            }
        }

        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;

        ArrayList<Integer> divisors = findDivisors(number);

        System.out.println("Divisors of " + number + " are:");
        for (int d : divisors) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}


//That if (i != n/i) is only to avoid adding the same number twice when i * i == n.
