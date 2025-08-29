//3. Reverse a given string.

public class ReverseString_3 {
    public static void main(String[] args) {
        String str = "Himanshu Tiwari";
        String rev = reverse(str); 

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
    }

    static String reverse(String str){
        String rev = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
