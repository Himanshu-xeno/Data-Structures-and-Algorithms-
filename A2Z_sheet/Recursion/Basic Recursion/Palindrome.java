public class Palindrome {
    public static void main(String[] args) {
        String str = "ABCBA";
        //recursive approach output printing
        boolean ans = isPalindrome(0,str);
        System.out.println(ans);


        /* //normal approach output printing
        boolean ans = isPalindrome(str);
        System.out.println(ans); */
    }

    //Normal approach
    static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            //get characters from both ends
            char l = str.charAt(left);
            char r = str.charAt(right);

            //skip the non-letters/digits characters
            if(!Character.isLetterOrDigit(l)){
                left ++;
            }else if(!Character.isLetterOrDigit(r)){
                right --;
            }
            // If characters from both the end doesn't match => No palindrome
            else if(Character.isLetterOrDigit(l) != Character.isLetterOrDigit(r)){
                return false;
            }else{
                left ++;
                right --;
            }
        }

        return true;  //When all characters matched - It is a Palindrome
    }

    //Recursive approach
    static boolean isPalindrome(int index, String str){
        //Base condition : if we have checked till the middle then it is already a palindrome
        if(index >= str.length()/2)
            return true;

        // If characters from both ends don't match, it's not a palindrome
        if (str.charAt(index) != str.charAt(str.length() - index - 1)) {
            return false;
        }

        // Move towards the middle
        return isPalindrome(index + 1, str);
    }
}
