public class Search_in_Range {
    public static void main(String[] args) {
        String name = "Himanshu";
        char target = 'i';
        boolean ans = searchinrange(name, target, 0, 6);
        System.out.println(ans);
    }

    static boolean searchinrange(String str, char target, int start, int end){
        if(str.length() ==0){
            return false;
        }

        for (int i = start; i < end; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
