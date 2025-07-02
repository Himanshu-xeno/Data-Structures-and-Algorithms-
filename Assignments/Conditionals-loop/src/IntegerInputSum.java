import java.util.Scanner;

public class IntegerInputSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, num;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            num = in.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println("The sum of number inputs is: " + sum);
    }
}
