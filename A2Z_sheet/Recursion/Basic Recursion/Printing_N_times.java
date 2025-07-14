public class Printing_N_times {
    public static void main(String[] args) {
        printNtimes(1, 3); // start from 1, print 3 times
    }

    static void printNtimes(int count, int n){
       if(count > n){
           return ;
    }
        System.out.println("Hello");
       printNtimes(count + 1, n);
}
}
