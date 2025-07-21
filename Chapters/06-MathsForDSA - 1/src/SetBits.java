//Given a number n, find the no. of set bits in it ?

public class SetBits {
    public static void main(String[] args) {
        int n = 626;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setbit(n));
    }

    static int setbit(int n){
        int count = 0;

        while(n>0){
            count++;
            n = (n & (n-1));
        }
        return count;
    }
}
