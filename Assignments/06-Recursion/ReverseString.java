//Reverse the array of characters in-place (i.e., don’t use extra memory), and do it with O(1) extra space and O(n) time

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        printReverse(s);
        recursiveReverse(s,0,s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    //brute-force : Reverse the String   tc=O(n), sc=O(1)
    static void printReverse(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            //Swap the characters at both pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            //move the pointers inwards now
            left ++;
            right --;
        }
    }

    //optimal approach : Recursive method    tc=O(n), sc=O(n)
    static void recursiveReverse(char[] s,int left, int right ){
        //Base condition
        if (left >= right) return;

        // Swap
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        //Recursive call with narrowed pointers
        recursiveReverse(s, left+1, right-1);
    }
}
