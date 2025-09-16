public class ReverseWordString {
    public static void main(String[] args) {
        String str = "  hello world  ";
        System.out.println(reverseWords(str));
    }

    static String reverseWords(String str) {
        String[] words = str.split("\\s+");

        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);

            if (i != 0) res.append(" ");
        }
        return res.toString().trim();
    }
}
