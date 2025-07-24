//Write a recursive function that returns the factorial of a number.
//fact(n) = 1  , when n <= 1
//fact(n) = n * fact(n-1)  , otherwise

public class FactorialOfNumber {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }

    //Recursive approach for factorial   tc=O(n), sc=O(n) -> call stack
    static int fact(int n){

        if(n <= 1) return 1; //base condition

        return n * fact(n-1);
    }


}
