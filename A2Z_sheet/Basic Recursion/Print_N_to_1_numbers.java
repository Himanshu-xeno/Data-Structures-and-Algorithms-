public class Print_N_to_1_numbers {
    public static void main(String[] args) {
        printNumbers(5);
    }

    static void printNumbers(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }
}
