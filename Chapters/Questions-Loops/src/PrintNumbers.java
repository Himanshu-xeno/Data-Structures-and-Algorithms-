import java.util.Scanner;
public class PrintNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till you want to print:  ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

}
