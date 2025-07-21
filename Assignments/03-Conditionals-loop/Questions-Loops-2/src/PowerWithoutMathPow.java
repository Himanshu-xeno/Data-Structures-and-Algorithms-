//FInd the power without using the Math.pow()

import java.util.Scanner;
public class PowerWithoutMathPow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base = ");
        double base = in.nextDouble();
        System.out.print("Enter the exponent = ");
        double expo = in.nextDouble();

        double power = 1;
        while(expo>0){
            power*=base;
            expo--;
        }
        System.out.printf("The power of the exponent = %.2f",power);
    }
}
