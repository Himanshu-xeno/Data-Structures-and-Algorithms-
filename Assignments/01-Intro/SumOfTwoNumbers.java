import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter the number 1: ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println("The sum of " +num1+ " and " +num2+ " = " +sum);
    }
}
