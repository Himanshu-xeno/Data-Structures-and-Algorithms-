//Find the GCD/HCF of a number

public class GCD {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 15;

        int gcd = findGcd4(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }

    //Brute-force Algorithm         TC = O(min(N1, N2)), SC = O(1)
    static int findGcd(int n1, int n2){
        int gcd = 1;

        for (int i = 1; i <= Math.min(n1,n2); i++) {
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    //Better approach - with fewer iterations          (Has same TC & SC)
    static int findGcd2(int n1, int n2){
        int gcd = 1;

        for (int i =  Math.min(n1,n2); i > 0; i--) {
            if(n1 % i == 0 && n2 % i == 0){
                return i;
            }
        }
        return 1;
    }

    //Optimal approach
    static int findGcd3(int a, int b){

        while(a>0 && b>0){

            if(a>b){
                a = a % b;
            }else{
                b = b % a;
            }
        }

        if(a == 0){
            return b;
        }
        return a;
    }

    //Better Optimal approach
    static int findGcd4(int a,int b){

        while ( b!= 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
