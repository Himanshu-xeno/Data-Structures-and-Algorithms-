public class GCD_LCM {
    public static void main(String[] args) {
                // Example usage
                System.out.println("GCD of 4 and 9: " + gcd(4, 9));
                System.out.println("LCM of 2 and 7: " + lcm(2, 7));
            }

            // Recursive method to find GCD using the Euclidean algorithm
            static int gcd(int a, int b) {
                if (a == 0) {
                    return b;
                }
                return gcd(b % a, a);
            }

            // Method to find LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
            static int lcm(int a, int b) {
                return (a * b) / gcd(a, b);
            }
        }

