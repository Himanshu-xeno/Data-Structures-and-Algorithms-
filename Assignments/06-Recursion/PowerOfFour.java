// Return true if n is a power of 4 (i.e., n == 4^x for some integer x); else return false

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFourIterative(16)); // true
        System.out.println(isPowerOfFourRecursive(3));  // false
    }

    //brute-force : iterative approach  tc=O(log n), sc=O(1)
    static boolean isPowerOfFourIterative(int n) {
        if (n <= 0) return false;

        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }

    //recursive approach   tc=O(log n), sc=O(1og n)
    static boolean isPowerOfFourRecursive(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 4 != 0) return false;
        return isPowerOfFourRecursive(n / 4);
    }
}


//What’s the logic?
//A number is a power of 4 only if it can be divided by 4 repeatedly until it becomes 1.
//So the recursion keeps dividing by 4, and:
//
//If we hit 1 → it's a power of four ✅
//
//If we hit an odd number or go ≤ 0 → it's not ❌