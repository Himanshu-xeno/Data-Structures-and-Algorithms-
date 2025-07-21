/*
Given a non-negative integer x, return its square root rounded down to the nearest integer.
Do not use built-in exponent functions.

Example:
Input: x = 4  → Output: 2
Input: x = 8  → Output: 2

Constraints:
0 <= x <= 2^31 - 1
*/


public class SquareRoot_search {
    public static void main(String[] args) {
        int num = 4;
        int ans = searchSquare(num);
        System.out.println(ans); // Output: 2
    }

    static int searchSquare(int num) {
        // Edge case: If num is 0 or 1, the square root is the number itself
        if (num == 0 || num == 1) {
            return num;
        }

        int ans = 0; // To store the result
        for (int i = 0; i <= num; i++) {
            if (i * i <= num) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }
}