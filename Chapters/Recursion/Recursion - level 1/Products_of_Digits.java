public class Products_of_Digits {
    public static void main(String[] args) {
        int ans = productOfDigits(102);
        System.out.println(ans);
    }

    static int productOfDigits(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) * productOfDigits(n/10);
    }
}


