//Subtract 2 numbers without using +/-

public class SubtractTwoIntegrs {
    public static void main(String[] args) {
        int a = 23;
        int b = 23;
        int sum = getSubtract(a,b);
        System.out.println(getSubtract(a,b));
    }

    static int getSubtract(int a, int b) {
        return getSum(a, getSum(~b, 1));
    }

    static int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}

/*
🔁 Example: 7 - 5
Step 1: ~5 = -6
Step 2: -6 + 1 = -5
Step 3: 7 + (-5) = 2 
 */


//TC = O(1): at most 32 iterations for 32-bit integers
//Note : It can handle both -ve and +ve numbers (Because of 2's compliment representation)