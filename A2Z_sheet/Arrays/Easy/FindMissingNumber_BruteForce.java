// Finding the Missing Number from 1 to N - Brute Force Approach

public class FindMissingNumber_BruteForce {

  public static void main(String[] args) {
    int a[] = { 1, 2, 4, 5 }; // Input array with one number missing
    int N = 5; // Total numbers should be from 1 to N

    int missing = findMissingNumber(a, N);

    System.out.println("The missing number is: " + missing);
  }

  // Function to find the missing number using brute force
  static int findMissingNumber(int[] a, int N) {

    // Loop from 1 to N (the complete range)
    for (int num = 1; num <= N; num++) {
      boolean found = false;

      // Check if num exists in the array
      for (int i = 0; i < N - 1; i++) {
        if (a[i] == num) {
          found = true;
          break; // Stop checking once found
        }
      }

      // If num is not found in array, it's the missing one
      if (!found) {
        return num;
      }
    }

    // This line will never be reached (guaranteed by the problem)
    return -1;
  }
}
