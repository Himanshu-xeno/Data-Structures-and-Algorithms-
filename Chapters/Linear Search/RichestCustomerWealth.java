public class RichestCustomerWealth {
    public static void main(String[] args) {
        // Sample 2D array input
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 3, 2}
        };

        // Call the method and print the result
        int result = maximumWealth(accounts);
        System.out.println("Richest customer wealth is: " + result);
    }

    static int maximumWealth(int[][] accounts) {
        // person = row, account = col

        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
