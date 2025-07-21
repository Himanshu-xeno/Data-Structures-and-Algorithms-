public class CountDigitsNumber {
    public static void main(String[] args) {
        int n = 12345;
        int digits = countNumber(n);
        int op = countNumberOptimal(n);;;;

        System.out.println(digits);
        System.out.println(op);
    }

    static int countNumber(int n){
        int count = 0;
        while(n>0){
            count += 1;
            n /= 10 ;
        }
        return count;
    }

    static int countNumberOptimal(int n){
        int count = (int) (Math.log10(n) + 1);
        return count;
    }
}
