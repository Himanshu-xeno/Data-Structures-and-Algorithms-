//FInd the nth magic number (Amazon)

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;

        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n&1; //we found out the last digit
             n = n>>1; //Right shift

            ans += last * base; // Add contribution of current bit
            base = base * 5;    // Move to the next power of 5

        }
        System.out.println("The Magic number = " +ans);

    }
}
