import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

        if(sum == original){
            return true;
        }
        return false;
    }
}
