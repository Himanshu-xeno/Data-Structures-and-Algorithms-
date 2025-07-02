public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        int n = 37;
        int sqrtInt = findSqrt(n);
        double sqrtPrecise = findSqrtWithPrecision(n, 3);

        System.out.println("Integer Square Root: " + sqrtInt);
        System.out.printf("Precise Square Root: %.3f\n", sqrtPrecise);
    }

    static int findSqrt(int n) {
        if (n == 0 || n == 1) return n;

        int left = 1, right = n, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == n) return mid;
            if (mid * mid < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    static double findSqrtWithPrecision(int n, int precision) {
        double left = findSqrt(n), mid = 0.0, increment = 0.1;

        for (int i = 0; i < precision; i++) {
            while (left * left <= n) {
                mid = left;
                left += increment;
            }
            left = mid;
            increment /= 10;
        }
        return mid;
    }
}
