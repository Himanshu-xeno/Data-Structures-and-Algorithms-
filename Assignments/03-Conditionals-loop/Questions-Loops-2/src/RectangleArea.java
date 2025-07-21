import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length = ");
        double l = in.nextDouble();
        System.out.print("Enter the breadth = ");
        double b = in.nextDouble();
        System.out.printf("Area of the Rectangle = %.2f", l*b );
    }
}
