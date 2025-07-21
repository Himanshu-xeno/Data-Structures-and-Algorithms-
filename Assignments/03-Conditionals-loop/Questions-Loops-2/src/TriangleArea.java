import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the choice you want to find the Area of a Triangle.");
        System.out.println("1.Using height and base. ");
        System.out.println("2.Using Heron's formula. ");
        System.out.println("3.Using Two sides and included angle. ");
        System.out.println("4.Using Equilateral Triangle. ");
        System.out.println("5.Exit. ");
        System.out.print("Enter your choice: ");

        int choice = in.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter a height : ");
                float height = in.nextFloat();
                System.out.print("Enter a base : ");
                float base = in.nextFloat();
                System.out.printf("Area of a Triangle = %.2f ",0.5*height*base );
                break;

            case 2:
                System.out.print("Enter the value of side a : ");
                float a = in.nextFloat();
                System.out.print("Enter the value of side b : ");
                float b = in.nextFloat();
                System.out.print("Enter the value of side c : ");
                float c = in.nextFloat();
                float s = (a+b+c)/2;
                System.out.printf("Area of a Triangle = %.2f ",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                break;

            case 3:
                System.out.print("Enter the value of side x = ");
                float x = in.nextFloat();
                System.out.print("Enter the value of side y = ");
                float y = in.nextFloat();
                System.out.print("Enter the degree of Triangle (on degrees) = ");
                float z = in.nextFloat();
                double C_radians = Math.toRadians(z);
                System.out.printf("Area of a Triangle = %.2f ",0.5*x*y*Math.sin(C_radians));
                break;

            case 4:
                System.out.print("Enter the value of side m = ");
                float m = in.nextFloat();
                System.out.printf("Area of a Triangle = %.2f ",(Math.sqrt(3)/4)*(m*m));
                break;

            case 5 :
                System.out.println("Exiting.....");
                break;

            default:
                System.out.println("Wrong entry !!");
                break;

        }
    }
}
