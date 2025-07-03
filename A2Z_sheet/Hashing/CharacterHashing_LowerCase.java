import java.util.Scanner;

public class CharacterHashing_LowerCase {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a string(only lowercase letters a-z) : ");
        String str = sc.next();

        int[] hash = new int[26]; //26 lowercase English letters

        //pre-compute frequencies
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++ ;
        }

        //query
        System.out.println("Enter the character to query:");
        char ch = sc.next().charAt(0);

        System.out.println("The count of character '" + ch + "' is: " + hash[ch - 'a']);

    }
}
