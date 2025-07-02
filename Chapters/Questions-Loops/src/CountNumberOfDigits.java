import java.util.Scanner;
public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = in.nextInt();

        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.print("The no. of Digits = " + count);
    }
}