/*
5. Floor and Ceil in Sorted Array
The floor of x is the largest element in the array which is smaller than or equal to x. (<=x)
The ceiling of x is the smallest element in the array greater than or equal to x.(>=x)
*/

public class Floor_Ceil_05 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int x = 15;

        int f = floor(arr, x);
        int c = ceil(arr, x);

        System.out.println("Floor of " + x + " = " + f);
        System.out.println("Ceil of " + x + " = " + c);
    }

        // Function to find floor of x
        public static int floor(int[] arr, int x) {
            int low = 0, high = arr.length - 1;
            int ans = -1; // default if no floor exists

            while (low <= high) {
                int mid = low + (high - low)/2;

                if (arr[mid] == x) {
                    return arr[mid]; // exact match = floor
                } else if (arr[mid] < x) {
                    ans = arr[mid];  // candidate for floor
                    low = mid + 1;   // try to find a bigger floor (right search)
                } else {
                    high = mid - 1;  // too big, move left (left search)
                }
            }
            return ans;
        }

        // Function to find ceil of x
        public static int ceil(int[] arr, int x) {
            int low = 0, high = arr.length - 1;
            int ans = -1; // default if no ceil exists

            while (low <= high) {
                int  mid = low + (high - low)/2;

                if (arr[mid] == x) {
                    return arr[mid]; // exact match = ceil
                } else if (arr[mid] > x) {
                    ans = arr[mid];  // candidate for ceil
                    high = mid - 1;  // try to find a smaller ceil(left search)
                } else {
                    low = mid + 1;   // too small, move right (right side)
                }
            }
            return ans;
    }

}
