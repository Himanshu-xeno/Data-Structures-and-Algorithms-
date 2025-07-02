public class Print_N_to_1 {
    public static void main(String[] args) {
        concept(5);
    }

    //Concept
    static void concept(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        concept(--n);
        //concept(n--);
    }

    //Print N to 1
    static void printNumberRev(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);

        printNumberRev(n-1);
    }

    //Print 1 to N
    static void printNumber(int n){
        if(n == 0){
            return;
        }
        printNumber(n-1);

        System.out.println(n);
    }

    static void printNumberBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumberBoth(n-1);
        System.out.println(n);
    }
}
