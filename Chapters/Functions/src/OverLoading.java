public class OverLoading {
    public static void main(String[] args) {
        fun(34,34);
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(int a, int b){
        System.out.println("Second one");
        System.out.println(b);
    }
}
