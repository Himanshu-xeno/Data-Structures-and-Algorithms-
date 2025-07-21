public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1]; // All values default to false
        System.out.println(primes[0]); // Prints: false (default)
        sieve(n, primes);
    }

    static void sieve(int n, boolean[] primes) { // Fixed return type (void)
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) { // If i is prime
                for (int j = i * 2; j <= n; j += i) { // Mark multiples as true (not prime)
                    primes[j] = true;
                }
            }
        }

        // Print prime numbers
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
