import java.util.Scanner;

public class CharacterHashing_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the string
        System.out.println("Enter an uppercase string:");
        String s = sc.next();  // Example: "ABCDABEF"

        int[] hash = new int[26]; // for 'A' to 'Z'

        // Step 2: Precompute character frequencies
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                hash[ch - 'A']++;
            }
        }

        // Step 3: Process queries
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the character to query:");
            char queryChar = sc.next().charAt(0);
            if (queryChar >= 'A' && queryChar <= 'Z') {
                System.out.println("Count of '" + queryChar + "' is: " + hash[queryChar - 'A']);
            } else {
                System.out.println("Invalid character. Only uppercase A–Z allowed.");
            }
        }
    }
}
