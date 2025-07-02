public class VarArgs {
    public static void main(String[] args) {
        fun(23, 34,45,56,66);
    }

    static void fun(int ...v){
        for(int num: v){
            System.out.print(num + " ");
        }

    }
}
