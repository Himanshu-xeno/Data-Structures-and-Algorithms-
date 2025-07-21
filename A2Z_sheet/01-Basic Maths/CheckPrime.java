public class CheckPrime {
    public static void main(String[] args) {
        /*int n = 1483;
         boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        } */

        /* boolean ans = optimalCheckPrime1(32);
        System.out.println(ans); */

        boolean ans = optimalCheckPrime2(32);
        System.out.println(ans);
    }

    //brute-force approach
    static boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    //optimal approach - using for-loop
    static boolean optimalCheckPrime1(int n){
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                count +=1;

                if(n/i != i){
                    count += 1;
                }
            }
        }

        if(count == 2){
            return true;
        }else{
            return false;
        }
    }


    //optimal approach - using while-loop
    static boolean optimalCheckPrime2(int n){
        if(n <= 1){
            return false;
        }

        int count =2;
        while(count*count <= n){
            if( n % count == 0){
                return false;
            }
            count++;
        }
        return count*count > n;
    }
}
