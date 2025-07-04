public class Array_1D_index_return {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
        int ans = linearsearch_index_return(arr,target);
        System.out.println(ans);
    }

    static int linearsearch_index_return(int[] arr, int target){
    if(arr.length== 0){
        return -1;
    }

    for(int i = 0; i< arr.length; i++){
        int element = arr[i];
        if(element == target){
            return i;
        }
    }
    return -1;
    }
}
