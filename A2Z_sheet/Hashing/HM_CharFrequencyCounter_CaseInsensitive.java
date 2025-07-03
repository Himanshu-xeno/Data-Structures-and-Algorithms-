//It is counting only letters and ignoring the digits, spaces, symbols
//It is also case-insensitive

import java.util.HashMap;
import java.util.Scanner;

public class HM_CharFrequencyCounter_CaseInsensitive {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashMap<Character, Integer> map = new HashMap<>();

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Convert to lowercase to treat A and a as same
                ch = Character.toLowerCase(ch);

                // Count only letters (ignore digits, spaces, symbols)
                if (Character.isLetter(ch)) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }
            }

            System.out.println("Character Frequencies (Case-Insensitive):");
            for (char key : map.keySet()) {
                System.out.println("'" + key + "' → " + map.get(key));
            }
        }
    }

