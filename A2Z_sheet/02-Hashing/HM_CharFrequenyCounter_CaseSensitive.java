import java.util.Scanner;
import java.util.HashMap;

public class HM_CharFrequenyCounter_CaseSensitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a HashMap to store frequency of numbers
        HashMap<Character, Integer> map = new HashMap<>();

        //Enter the String
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        //Pre-compute
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //Counting the frequencies
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        //Printing the frequencies
        System.out.println("Character Frequencies :");
        for (char key : map.keySet()){
            System.out.println( key + " -> " + map.get(key));
        }
    }
}
