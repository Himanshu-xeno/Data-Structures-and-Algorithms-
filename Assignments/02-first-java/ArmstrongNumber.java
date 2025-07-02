//To find Armstrong Number between two given number.

import java.util.Scanner;
public class ArmstrongNumber {
    static boolean isArmstrong(int num){
        int originalNum = num, sum= 0, digits = 0;

        int temp = num;
        while(temp>0){
            temp/=10;
            digits++;
        }

        temp = num;
        while (temp>0){
            int digit = temp%10;
            sum+= Math.pow(digit, digits);
            temp/=10;
        }
        return sum== originalNum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the starting number : ");
        int low = in.nextInt();

        System.out.println("Enter the ending number : ");
        int high = in.nextInt();

        System.out.println("Armstrong numbers between " + low + " and " + high + " are:");
        for (int i = low; i <= high; i++) {
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
}
