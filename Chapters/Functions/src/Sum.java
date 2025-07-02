import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
       // sum();
        int ans = sum2(124793280, 4564);
        System.out.println("Sum: " + ans);
    }

    static int sum2(int a, int b){
        Scanner in = new Scanner(System.in);
        /*System.out.println("Enter the number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("Sum : " +sum); */

//        System.out.print("Enter the number 1 : ");
//        int num1 = in.nextInt();
//        System.out.print("Enter the number 2 : ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum;


             int sum = a+b;
             return sum;



    }
}
