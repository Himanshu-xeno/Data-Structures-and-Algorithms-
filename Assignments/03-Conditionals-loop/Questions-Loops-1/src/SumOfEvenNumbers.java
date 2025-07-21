import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the max number limit for Even number: ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("The result sum of even number = " +sum);
    }
}
