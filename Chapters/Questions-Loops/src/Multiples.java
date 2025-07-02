import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("The multiples of " + n + " are:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");  // Print inside the loop
        }
    }
}
