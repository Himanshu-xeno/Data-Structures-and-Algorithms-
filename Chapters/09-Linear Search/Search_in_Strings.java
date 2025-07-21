import java.util.Arrays;

public class Search_in_Strings {
    public static void main(String[] args) {
        String name = "Himanshu";
        char target = 'z';
        boolean ans = searchinStrings_foreachLoop(name, target);
        System.out.println(ans);
    }

    static boolean searchinStrings(String str, char target){
        if(str.length() ==0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
              return true;
            }
        }
        return false;
    }

    static boolean searchinStrings_foreachLoop(String str, char target){
        if(str.length() ==0){
            return false;
        }

       for(char ans : str.toCharArray()){
           if(ans == target){
               return true;
           }
       }
       return false;
    }
}
