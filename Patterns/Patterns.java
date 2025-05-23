public class Pattern {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(4);
        //pattern6(5);
        pattern7(5);


    }
    static void pattern1(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    static void pattern2(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <=n; col++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    static void pattern3(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n-row ; col++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println( );
        }
    }

    static void pattern5(int n){
        for (int row = 0; row <= 2*n -1; row++) {
            int totalColInRow = row > n ? 2*n - row : row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    static void pattern6(int n){
        for (int row = 0; row <= 2*n -1; row++) {
            int totalColInRow = row > n ? 2*n - row : row;

            int noSpaces = n-totalColInRow;
            for (int s = 0; s < noSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }

    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }


}
