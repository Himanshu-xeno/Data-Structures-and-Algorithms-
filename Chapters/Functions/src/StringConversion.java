import java.util.Scanner;
public class StringConversion {
    public static void main(String[] args) {
        String name2 = hello();
        System.out.print("Your name is : " +name2);

    }

    static String hello(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name  = in.next();
        return name;
    }
}
