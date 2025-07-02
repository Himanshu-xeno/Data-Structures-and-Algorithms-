//Printing the nth Recursion number

public class fibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    static int fibo(int n){
        //Base Condition - returning the Answers we have got
        if(n<2){
            return n;
        }

        //This is not a Tail recursion - as this isn't the last function call {The addition part is the last thing to occur}
        return fibo(n-1) + fibo(n-2);
    }
}
