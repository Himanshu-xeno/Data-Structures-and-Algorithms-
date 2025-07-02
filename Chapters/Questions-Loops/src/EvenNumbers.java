import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the max number limit for Even number: ");
        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
