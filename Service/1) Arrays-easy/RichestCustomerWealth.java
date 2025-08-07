/*
🧪 Example:
Input:
  accounts = [
      [1, 2, 3],  // Customer 0 → wealth = 6
      [3, 2, 1]   // Customer 1 → wealth = 6
  ]
Output:
  Max Wealth = 6

🕒 Time Complexity: O(m * n)
   - m = number of customers (rows)
   - n = number of accounts per customer (columns)

📦 Space Complexity: O(1) ->  Only using a few variables (sum, maxWealth)
*/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},  // total = 6
                {3, 2, 1},   // total = 6
                {4, 5, 90}
        };

        int result = findRichestCustomer(accounts);
        System.out.println("Max Wealth = " + result);  // Output: 6
    }

    static int findRichestCustomer(int[][] accounts) {
        int maxWealth = 0;

        for (int row = 0; row < accounts.length; row++) {

            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum = sum + accounts[row][col];  // sum of each customer's accounts
            }

            // update max if current sum is greater
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}

