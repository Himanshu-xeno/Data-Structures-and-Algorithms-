//Write a recursive function that returns the factorial of a number.
//fact(n) = 1  , when n <= 1
//fact(n) = n * fact(n-1)  , otherwise

public class FactorialOfNumber {
    public static void main(String[] args) {
        int ans = factoFor(5);
        //int ans = factoWhile(5);
        //int ans = fact(5);
        System.out.println(ans);
    }

    //Recursive approach for factorial   tc=O(n), sc=O(n) -> call stack
    static int fact(int n){

        if(n <= 1) return 1; //base condition    //Donot forget to keep <= sign

        return n * fact(n-1);
    }

    //iterative code - while loop
    static int factoWhile(int n){
        int fact = 1;
        int i = 2;
        while(i <= n){          //Donot forget to keep <= sign
            fact *= i;
            i++;
        }
        return fact;
    }

    //iterative code - for loop
    static int factoFor(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++) {   //Donot forget to keep <= sign
            fact *= i;
        }
        return fact;
    }

}
