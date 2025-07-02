import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the radius: ");
        int r = in.nextInt();

        double area = Math.PI *r*r;
        System.out.printf("The Area of Circle = %.2f" , area);
    }
}
