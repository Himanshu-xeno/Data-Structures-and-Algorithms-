//find the factorial of a number

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = in.nextInt();
        int fact = 1    ;
        for (int i = num; i >=1 ; i--) {
            fact *=i;
        }
        System.out.println(fact);
    }
}
