//Find the no of digits in base b?

public class NoOfDigits {
    public static void main(String[] args) {

        int n = 34567;
        int b = 2;

        int ans = (int)(Math.log(n)/Math.log(b)) + 1;

        System.out.println(ans);
    }
}
