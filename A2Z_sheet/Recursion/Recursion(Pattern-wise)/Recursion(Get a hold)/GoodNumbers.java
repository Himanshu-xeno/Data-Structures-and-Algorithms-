//(1922) A digit string is considered good if the digits at even indices (0-based) are even digits (0, 2, 4, 6, 8) and the digits at odd indices are prime digits (2, 3, 5, 7).
//Given an integer n, return the total number of good digit strings of length n. As the result may be large, return it modulo 109 + 7.
//A digit string is a string consisting only of the digits '0' through '9'. It may contain leading zeros.

public class GoodNumbers {
    public static void main(String[] args) {

        System.out.println("n = 1 : " + countGoodNumbers(1));  //output:5
        System.out.println("n = 50 : " + countGoodNumbers(50)); //output : 564908303
    }



    //Function to calculate (base^exponent)%MOD
    static long power(long base, long exponent, int mod){
        long results = 1;
        while(exponent > 0){
            if(exponent % 2 == 1){   // if expo is odd
                results = (results * base) % mod;
            }
            base = (base * base) % mod;   // square the base
            exponent = exponent / 2;  // divide expo by 2
        }
        return results;
    }



    //Function to count good digit strings
    static int countGoodNumbers(long n){
        int MOD = 1000000007;

        long evenPositions = (n+1)/2;  //count of positions
        long oddPositions = (n/2);   //count of positions

        long evenWays = power(5,evenPositions,MOD);  //5^evenPositions % MOD
        long oddWays = power(4,oddPositions,MOD);    //4^evenPositions % MOD

        return (int) ((evenWays * oddWays) % MOD);  //Total ways


    }
}
