//Input currency in rupees and output in USD.

import java.util.Scanner;
public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the rupees amount : ");
        int rs = in.nextInt();

        double dollar = rs/87.10;

        System.out.printf("The dollar amount : %.2f\n" , dollar);
    }
}
