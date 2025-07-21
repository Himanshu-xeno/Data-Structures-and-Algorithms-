public class Array_1D_boolean_return {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
        boolean ans = linearsearch_boolean_return(arr,target);
        System.out.println(ans);
    }

    static boolean linearsearch_boolean_return(int[] arr, int target){
        if(arr.length== 0){
            return false;
        }

        for(int i = 0; i< arr.length; i++){
            int element = arr[i];
            if(element == target){
                return true;
            }
        }
        return false;
    }
}


