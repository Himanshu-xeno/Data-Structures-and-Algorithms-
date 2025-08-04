//1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = in.nextInt();
        System.out.print("Enter the number 3 : ");
        int num3 = in.nextInt();

        int max = maxNumber(num1,num2,num3);
        int min = minNumber(num1,num2,num3);

        System.out.println(max);
        System.out.println(min);

    }

    static int maxNumber(int num1, int num2, int num3){
        int max = num1 ;
        if(num2 > num1){
            max = num2;
        }
        if(num3 > num2){
            max = num3;
        }
        return max;
    }

    static int minNumber(int num1, int num2, int num3){
        int min = num1;
        if(num2 < min){
            min = num2;
        }
        if(num3 < min){
            min = num3;
        }
        return min;
    }
}
