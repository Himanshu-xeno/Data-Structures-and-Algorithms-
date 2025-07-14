public class Print_1_to_N_numbers {
    public static void main(String[] args) {
        printNum(5);
    }

    static void printNum(int n){
        if(n == 0){
            return;
        }
        printNum(n - 1);
        System.out.println(n);
    }
}
