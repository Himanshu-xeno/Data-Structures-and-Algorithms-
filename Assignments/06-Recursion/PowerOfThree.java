// Return true if n is a power of 3 (i.e., n == 3^x for some integer x); else return false

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThreeIterative(27)); // true
        System.out.println(isPowerOfThreeRecursive(10)); // false
    }

    // brute-force : iterative approach  tc=O(log n), sc=O(1)
    static boolean isPowerOfThreeIterative(int n) {
        if (n <= 0) return false;

        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    // recursive approach   tc=O(log n), sc=O(log n)
    static boolean isPowerOfThreeRecursive(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;
        return isPowerOfThreeRecursive(n / 3);
    }
}

// What’s the logic?
// A number is a power of 3 only if it can be divided by 3 repeatedly until it becomes 1.
// So the recursion keeps dividing by 3, and:
//
// If we hit 1 → it's a power of three ✅
// If we hit an odd number or go ≤ 0 → it's not ❌
