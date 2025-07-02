//Find the divisors of a number n - Brute-force approach

public class Divisor_BruteForce {
    public static void main(String[] args) {
        int number = 12;

        int[] size = new int[1]; // to store the count of divisors
        int[] divisors = findDivisors(number, size);

        System.out.println("Divisors of " + number + " are:");
        for (int i = 0; i < size[0]; i++) {
            System.out.println(divisors[i]);
        }
    }

    //brute-force approach
    static int[] findDivisors(int n, int[] size) {
        int[] divisors = new int[n]; // maximum possible divisors = n
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[count] = i;  // store the divisor
                count = count + 1;    // increase the count
            }
        }

        size[0] = count; // pass the count back to main
        return divisors; // return the array of divisors
    }
}


