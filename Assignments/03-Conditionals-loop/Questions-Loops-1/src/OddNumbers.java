import java.util.Scanner;
public class OddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the max number limit for Odd number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i%3==0){
                System.out.print(i + " ");
            }
        }
    }
}

