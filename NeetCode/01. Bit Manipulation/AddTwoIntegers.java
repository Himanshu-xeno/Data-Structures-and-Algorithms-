//Add 2 numbers without using +/-

public class AddTwoIntegers {
    public static void main(String[] args) {
        int a = 23;
        int b = 23;
        int sum = getSum(a,b);
        System.out.println(getSum(a,b));
    }

    static int getSum(int a, int b) {
        while(b != 0){
            int carry = (a & b) << 1;
            a = a^b;
            b = carry;
        }
        return a;
    }
}


//TC = O(1): at most 32 iterations for 32-bit integers
//Note : It can handle both -ve and +ve numbers (Because of 2's compliment representation)