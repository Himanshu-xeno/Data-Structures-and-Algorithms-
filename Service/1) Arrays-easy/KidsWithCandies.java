// ❓ Q: Kids With the Greatest Number of Candies
// 🧠 Given an array candies[] where candies[i] is the number of candies the i-th kid has,
// and an integer extraCandies, return a boolean list where result[i] is true if
// after giving the i-th kid all extraCandies, they will have the greatest number of candies.
// 🧪 Example: candies = [2,3,5,1,3], extraCandies = 3 → [true,true,true,false,true]
// 🔁 TC: O(n), 📦 SC: O(n)


import java.util.*;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Step 1: Find the maximum candies any kid has
        int maxCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        // Step 2: Check each kid
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies1, 3)); // [true, true, true, false, true]

        int[] candies2 = {4, 2, 1, 1, 2};
        System.out.println(kidsWithCandies(candies2, 1)); // [true, false, false, false, false]

        int[] candies3 = {12, 1, 12};
        System.out.println(kidsWithCandies(candies3, 10)); // [true, false, true]
    }
}
