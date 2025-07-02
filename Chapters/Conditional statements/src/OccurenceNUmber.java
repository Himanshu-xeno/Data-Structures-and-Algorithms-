import java.util.Scanner;
public class OccurenceNUmber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter thr number : ");
        int num = in.nextInt();

        int count = 0;
        while(num>0){
            int rem = num%10;
            if(rem==5){
                count++;
            }
            num= num/10;
        }
        System.out.println("The number of times 5 occurs is : " +count);
    }
}
