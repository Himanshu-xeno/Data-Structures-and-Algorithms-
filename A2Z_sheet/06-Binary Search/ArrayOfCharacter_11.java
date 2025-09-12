//11) Find Smallest Letter Greater Than Target
//given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

public class ArrayOfCharacter_11 {
    public static void main(String[] args) {
        char[] letters = {'c','f','k','l'};
        char target = 'z';
        char result = nextGreatestLetter(letters,target);
        System.out.println(result);

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // start could be out of bounds, use modulo for wrap-around
        //and just return the first char
        //Note : Alphabets is cricular array so we need this wrap-around thing as last thing to return if not found
        return letters[start % letters.length];
    }
}
