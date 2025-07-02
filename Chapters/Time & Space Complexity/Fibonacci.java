public class Fibonacci {
    public static void main(String[] args) {
        System.out.println((long)fibo(50)); // Cast to long for clean output
    }

    static double fibo(int n) { // Parameter should be int
        return (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5);
    }
}
