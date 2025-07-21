import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the numbers seperated by spaces: ");

        int num1= in.nextInt();
        int num2= in.nextInt();
        int num3= in.nextInt();

        int max= num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println(" The largest number is :" +max);


    }
}
