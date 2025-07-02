import java.util.Arrays;

public class SortedMatrix_MyOwn_Method {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

   /* Binary search function - but instead of usual 1D array it does
   on one-specific row of a 2D matrix => between the 2 columns */
    //It is a row based BS
    static int[] binarySearch(int[][]matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    //It is 4-steps based logic
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        //Step-1 : handle the edge cases
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols - 1; //This will be used just for the comparison purpose

        if(cols == 0) return new int[] {-1,-1};
        if(rows == 1) return binarySearch(matrix, 0, 0, cols -1, target);

        /*Step-2 :Finding the mid-column and performing the
         Binary search vertically on that column => to reduce the no. of rows */
        //Repeating this loop until just 2 rows are left
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target) return new int[] {mid, cMid};

            if(matrix[mid][cMid] < target) {
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        // Step-3 : After the above step, we reduced the search space to 2 rows => rStart, rstart+1 and we already have the mid column : cMid
        /*Before doing anything further in this step,
         just check whether the target element is found in the mid column of these 2 rows */

        if(matrix[rStart][cMid] == target) return new int[]{rStart, cMid};
        if(matrix[rStart + 1][cMid] == target) return new int[]{rStart + 1, cMid};

        //Step-4 : searching int the one of the remaining 4 parts
        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else { //search in 4th half
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }
}
