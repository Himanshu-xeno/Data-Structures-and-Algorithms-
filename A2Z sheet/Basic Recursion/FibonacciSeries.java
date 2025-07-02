public class FibonacciSeries {
    public static void main(String[] args) {
        //fibonacci(N) part
        int N = 5;
        System.out.println(fibonacci(N));
        //printing the series
        for (int i = 0; i <= 5; i++) {
            System.out.print(fibonacci(i) + " ");
        }


        //fibo(n) part
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    //Approach-1
    static int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    //Approach-2
    static int fibonacci(int N) {
        // Base Condition.
        if (N <= 1) {
            return N;
        }

        /* Problem broken down into 2 functional calls
         and their results combined and returned. */
        int last = fibonacci(N - 1);
        int slast = fibonacci(N - 2);

        return last + slast;
    }
    }
