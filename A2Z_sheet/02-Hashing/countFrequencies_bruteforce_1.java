//Given an array nums of size n which may contain duplicate elements,
//return a list of pairs where each pair contains a unique element
// from the array and its frequency in the array.
// BRUTE-force

import java.util.Arrays;

public class countFrequencies_bruteforce_1 {
    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5};

        //Find max element to define size of Hash max
        int max = Arrays.stream(arr).max().getAsInt();
        countFreq(arr,max);
    }

    static void countFreq(int[] arr, int max){
        //Pre-compute
        int[] hash = new int[max + 1];
        for(int num : arr){
            hash[num]++;
        }

        //Printing unique elements and their frequnecies
        for (int i = 0; i < hash.length; i++) {
            if(hash[i] > 0){
                System.out.println(i + " " + hash[i]);
            }
        }

    }


}
