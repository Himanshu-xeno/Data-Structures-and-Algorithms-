public class NewtonRaphsonSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n / x)); // Newton-Raphson formula

            // Stopping condition: If the difference is small enough, break
            if (Math.abs(root - x) < 0.0001) {// If the difference is less than 0.0001, the algorithm stops because the approximation is accurate enough.
                break;
            }

            x = root; // Update x for the next iteration
        }
        return root;
    }
}
