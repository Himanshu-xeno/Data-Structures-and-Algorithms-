/*
Camel case of a given sentence:
Given a sentence having lowercase characters, the task is to convert it to Camel Case. In Camel Case, words are joined without spaces, the first word keeps its original case, and each subsequent word starts with an uppercase letter.

Input: "i got intern at geeksforgeeks"
Output: "iGotInternAtGeeksforgeeks"
*/

public class CamelCase {
    public static void main(String[] args) {
        String s = "i got intern at geeksforgeeks";
        System.out.println(convertToCamelCase(s));
    }

    static String convertToCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isCapital = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                isCapital = true;
            } else if (isCapital) {
                sb.append(Character.toUpperCase(ch));
                isCapital = false;
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
