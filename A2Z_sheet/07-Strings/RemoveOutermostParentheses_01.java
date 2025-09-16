public class RemoveOutermostParentheses_01 {
    public static void main(String[] args) {
        String s1 = "(()())(())()";
        System.out.println(removeOuterParentheses(s1));
        System.out.println(removeOuter(s1));
        System.out.println(removing(s1));
    }

    //Most optimal way
    static String removing(String str){
        int balance = 0;

        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == ')') balance --;
            if(balance != 0) sb.append(c);
            if(c == '(') balance ++;
        }
        return sb.toString();
    }

    //Most baisc method - brute force
    static String removeOuterParentheses(String str){
        int openCount = 0;
        int closeCount = 0;
        String result = "";
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '('){
                openCount ++;
            } else{
                closeCount++;
            }

            if(openCount == closeCount){
                result = result + str.substring(start + 1, i);
                start = i+1;
            }
        }
        return result;
    }

    //optimal method -> using StringBuilder
    static String removeOuter(String str) {
        int openCount = 0, closeCount = 0, start = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') openCount++;
            else closeCount++;
            if (openCount == closeCount) {
                result.append(str.substring(start + 1, i));
                start = i + 1;
            }
        }
        return result.toString();
    }
}
