public class Array_1D_element_return {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8};
            int target = 6;
            int ans = linearsearch_element_return(arr,target);
            System.out.println(ans);
        }

        static int linearsearch_element_return(int[] arr, int target){
            if(arr.length== 0){
                return Integer.MAX_VALUE;
            }

            for(int i = 0; i< arr.length; i++){
                int element = arr[i];
                if(element == target){
                    return element;
                }
            }
            return Integer.MAX_VALUE;
        }
    }


