//Fibonacci Series In Java Programs
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till you want the fibonacci series = ");
        int n = in.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 3; i <=n ; i++) {
            int next = first + second;
            System.out.println(next);
            first=second;
            second=next;
        }
    }
}
