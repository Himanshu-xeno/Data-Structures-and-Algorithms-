/* Guess Number Higher or Lower
You're given a number n (from 1 to n).
I pick a number in this range — your task is to guess it.

You have a function guess(num) which tells you:
- -1 if num is higher than the pick
-  1 if num is lower than the pick
-  0 if num is correct

Goal:
Find the picked number.*/



public class GuessNumberGame {
    public static void main(String[] args) {
        int n = 1000; // The range of numbers
        int result = guessNumber(n);
        System.out.println("The picked number is: " + result);
    }

    static int guess(int num){
        int pick = 100;
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }

    static int guessNumber(int n){
        for (int i = 0; i <= n; i++) {
            int result = guess(i);
            if(result == 0){
                return i;
            }
        }
        return -1;
    }
}
