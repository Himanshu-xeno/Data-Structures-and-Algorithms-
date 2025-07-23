// Calculate the nth Fibonacci number where:
// F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2) for n > 1

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
    }

    //brute-force : using simple loop
    static int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0, second = 1;
        int next = 0;
        for (int i = 2; i <= n; i++) {
            next = first + second; // next fibonacci (This is to be found out)
            first = second;     // shift first to second
            second = next;     // shift second to next
        }
        return next;
    }


}
