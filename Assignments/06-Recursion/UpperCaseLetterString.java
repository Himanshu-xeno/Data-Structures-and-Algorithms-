public class UpperCaseLetterString {
    public static void main(String[] args) {
        String str = "Himanshu";
        //char ans = firstUpperCase(str);
        char ans = firstUpp(str,0);
        if(ans == 0){
            System.out.println("No upperCase letter");
        }else{
            System.out.println(ans);
        }
    }

    //Brute-force : Linear search : tc=O(N) , sc=O(1)-> no recursion, one loop variable only
    static char firstUpperCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return 0;
    }

    //Optimal : Recursive : tc=O(N) , sc=O(N) - due to recursion stack
    static char firstUpp(String str, int index){

        //Base condition : reached end of string
        if(index >= str.length()){
            return 0;
        }

        if(Character.isUpperCase(str.charAt(index))){
            return str.charAt(index);
        }

        //tail-Recursion
        return firstUpp(str, index+1);

    }


}
