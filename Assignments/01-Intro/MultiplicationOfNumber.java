import java.util.Scanner;
public class MultiplicationOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}
