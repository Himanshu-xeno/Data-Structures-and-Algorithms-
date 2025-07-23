// Return true if n is a power of 2 (i.e., n == 2^x for some integer x); else return false

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwoIterative(16)); // true
        System.out.println(isPowerOfTwoIterative(3));  // false
    }

    //brute-force : iterative approach
    static boolean isPowerOfTwoIterative(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    
}
