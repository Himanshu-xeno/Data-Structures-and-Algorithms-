//Find the power using Math.pow()

import java.util.Scanner;

public class PowerUsingMathPow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Tell me the base : ");
        double base = in.nextDouble();
        System.out.print("Tell me the exponent : ");
        double expo = in.nextDouble();
        if(expo>0) {
            double power = Math.pow(base, expo);
            System.out.printf("The Power of the exponent = %.2f", power);
        }else{
            System.out.println("Enter a valid positive exponent ! ");
        }
    }
}