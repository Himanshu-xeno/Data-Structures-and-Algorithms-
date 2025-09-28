/*
Check for Binary String :
Given a string s, the task is to check if it is a binary string or not.
A binary string is a string which only contains the characters '0' and '1'.
Input: s = "00100101"
Output: 3
Explanation: Valid substrings are "1001", "100101", and "101", all starting and ending with '1'.

 */

public class CheckBinary {
    public static void main(String[] args) {
        String s = "01010101010";
        System.out.println(isBinary(s));
    }

    static boolean isBinary(String s) {
        // Your code here
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' ){
                return false;
            }
        }
        return true;
    }
}
