// Check if a number is Palindrome or Not

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 45574;

        if(palindrome(number)){
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is not a Palindrome.");
        }
    }

    static boolean palindrome(int n){
        int reverseNum = 0;     // Stores the reverse of the number
        int originalNum = n;    // Stores the original number

        // Reverse Number algorithm
        while(n > 0){
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }

        return originalNum == reverseNum;
    }
}
