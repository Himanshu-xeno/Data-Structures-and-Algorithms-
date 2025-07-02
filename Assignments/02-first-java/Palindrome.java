import java.util.Locale;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a String : ");
        String str = in.nextLine();
        str = str.toLowerCase();

        String reversed = "";
        for(int i = str.length() -1; i>=0; i--){
            reversed += str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println("Given string is a palindrome.");
        }else{
            System.out.println("Given string is not a palindrome.");
        }
    }
}
