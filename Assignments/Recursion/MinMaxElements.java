/*
Find the Maximum and minimum elements of Arrays - GFG
i/p : arr = {1,3,5,-3,6,39}
o/p : min = -3 , max = 39
 */

public class MinMaxElements {
    public static void main(String[] args) {
        int[] arr = {1,4,3,-5,-4,8,9};
        //System.out.println(minMAx(arr));
        int[] result = findMinMax(arr, 0, arr[0], arr[0]);
        System.out.println("min = " + result[0] + ", max = " + result[1]);
    }

    /* //brute-force method
    static int minMAx(int[] arr){
//        int max = arr[0];
        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        //return max;
        return min;
    }  */


    //Recursive method
    static int[] findMinMax(int[] arr, int index, int min, int max){
        //base case : when we reach end of the array
        if(index == arr.length){
            return new int[] {min,max};
        }

        //Update the min and max
        if(arr[index] < min) {
            min = arr[index];
        }

        if(arr[index] > max){
            max = arr[index];
        }

        //Recursive call for next element
        return findMinMax(arr, index + 1, min, max);
    }
}

/*
 Method: Brute-force approach
 * Time Complexity (TC): O(n)
 * Space Complexity (SC): O(1)

 Method: Recursive approach
 * Time Complexity (TC): O(n)
 * Space Complexity (SC): O(n)
 */

