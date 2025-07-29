//Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 128;
        int ans = hammingWeight(n);
        System.out.println(hammingWeight(n));
    }

    //Brute-force
    static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);  // if the last bit is 1, add 1 to count
            n >>>= 1;          // unsigned right shift (important for negative numbers)
        }
        return count;
    }

    /*
✅ Alternative (Brian Kernighan's Algorithm – More Efficient):
public int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
        n &= (n - 1); // removes the lowest set bit
        count++;
    }
    return count;
}

✅ Recursive Solution:
public class Solution {
    public int hammingWeight(int n) {
        // Base case: if n is 0, no more 1's left
        if (n == 0) return 0;

        // Recursive step: add 1 if the least significant bit is 1
        return (n & 1) + hammingWeight(n >>> 1); // use >>> for unsigned shift
    }
}
*/
}
