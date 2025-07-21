import java.util.Scanner;
public class IsocelesTriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the equal sides a = " );
        double a = in.nextDouble();
        System.out.print("Enter the base b = ");
        double b = in.nextDouble();
        System.out.printf("Area of the Isoceles Triangle = %.2f", (b/4)*Math.sqrt((4*a*a)-(b*b)));
    }
}
