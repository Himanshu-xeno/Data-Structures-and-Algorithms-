//Check if a number is an Armstrong number

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong2(n));
    }

    //Brute-force approach
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        if(sum == original){
            return true;
        }else{
            return false;
        }
    }

    //Optimal-approach
    static boolean isArmstrong2(int num){
        int k = String.valueOf(num).length();

        int sum = 0;
        int n = num;

        while(n > 0){
            int rem = n % 10;
            sum += Math.pow(rem, k);
            n = n / 10;
        }
        return sum == num ? true : false;
    }
}
