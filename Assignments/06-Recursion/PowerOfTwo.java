// Return true if n is a power of 2 (i.e., n == 2^x for some integer x); else return false

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwoIterative(16)); // true
        System.out.println(isPowerOfTwoIterative(3));  // false
    }

    //brute-force : iterative approach  tc=O(log n), sc=O(1)
    static boolean isPowerOfTwoIterative(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    //recursive approach   tc=O(log n), sc=O(1og n)
    static boolean isPowerOfTwoRecursive(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;
        return isPowerOfTwoRecursive(n / 2);
    }
}


//What’s the logic?
//A number is a power of 2 only if it can be divided by 2 repeatedly until it becomes 1.
//So the recursion keeps dividing by 2, and:
//
//If we hit 1 → it's a power of two ✅
//
//If we hit an odd number or go ≤ 0 → it's not ❌