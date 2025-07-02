import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the word: ");
        char ch = in.next().charAt(0);


        if(ch>='a' && ch<='z'){
            System.out.println("This is a Lowercase word");
        }
        else{
            System.out.println("This is a Uppercase word");
        }
    }
}
