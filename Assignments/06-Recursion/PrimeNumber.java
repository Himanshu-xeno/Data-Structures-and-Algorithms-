//Check whether a number is prime or not ?

public class PrimeNumber {
    public static void main(String[] args) {
        int n1 = 21;
        int n2 = 29;

        // Using Recursive Method
        if (isPrime(n1, 2)) {
            System.out.println(n1 + " is a Prime number.");
        } else {
            System.out.println(n1 + " is not a Prime number.");
        }

        // Using Brute-force Iterative Method
        if (isPrimeBrute(n2)) {
            System.out.println(n2 + " is a Prime number.");
        } else {
            System.out.println(n2 + " is not a Prime number.");
        }
    }

    //recursive logic : using of Helper function(int n, int i)
    //n -> input number to check
    //i -> current divisor starting from 2
    static boolean isPrime(int n, int i){
        //base condition
        if( n <= i) return false;

        if( i * i > n) return true; //Factor found

        if( n % i == 0) return false;  //check the next i
        return isPrime(n, i+1);
    }

    //brute-force
    static Boolean isPrimeBrute(int n){
        if(n <= 1) return false;

        for (int i = 2; i * i <= n ; i++) {
            if( n % i == 0) return false;
        }
        return true;
    }
}
