import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = in.nextInt();

        for (int i = n; i >=1 ; i--) {
            System.out.print(i + " ");

        }
    }
}
