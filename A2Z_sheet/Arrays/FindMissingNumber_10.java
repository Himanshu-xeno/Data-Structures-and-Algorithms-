//Find the missing number from the array.

public class FindMissingNumber_10 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5}; // Missing number is 3
        int missing = bruteFind(arr);
        System.out.println("The missing number is: " + missing);
    }

    //brute-force approach   TC : O(N^2), SC : O(1)
    static int bruteFind(int[] arr){
        // Loop from 1 to arr.length + 1 (as one number is missing)
        for (int num = 1; num <= arr.length + 1; num++) {
            boolean found = false;

            // Check if num exists in the array
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }

            // If num is not found, it's the missing number
            if (!found) {
                return num;
            }
        }
        return -1;
    }

    //optimal approach - Summation   TC : O(N), SC : o(1)
    static int optimalFind(int[] arr){
        int n = arr.length + 1;  //Total numbers must include the missing one too
        int totalSum = (n*(n+1))/2;  //sum of first n natural number

        int arraySum = 0;
        for(int num : arr){
            arraySum += num;
        }
        return totalSum - arraySum; //This is the missing number
    }
}


