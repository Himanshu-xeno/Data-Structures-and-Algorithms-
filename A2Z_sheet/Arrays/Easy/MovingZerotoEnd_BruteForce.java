//You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

//Brute-force

import java.util.ArrayList;
import java.util.Arrays;

public class MovingZerotoEnd_BruteForce {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 3, 4, 5, 0, 2, 9, 0, 2, 0 };
    moveZeros(arr);
    System.out.println(Arrays.toString(arr));
  }

  static int[] moveZeros(int[] arr) {

    // temporary array
    ArrayList<Integer> temp = new ArrayList<>();

    // copying non-zero elements from og array -> temp array
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        temp.add(arr[i]);
      }
    }

    // Number of non-zero elements
    int nz = temp.size();

    // copying elements from temp array
    // filling the first nz fields of og array
    for (int i = 0; i < nz; i++) {
      arr[i] = temp.get(i);
    }

    // filling the rest of the cells with zeros
    for (int i = nz; i < arr.length; i++) {
      arr[i] = 0;
    }

    return arr;
  }
}