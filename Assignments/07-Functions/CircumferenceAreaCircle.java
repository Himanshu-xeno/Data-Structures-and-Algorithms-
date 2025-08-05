//6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class CircumferenceAreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        double radius = in.nextDouble();

        double circumference = findCircumference(radius);
        double area = findArea(radius);
        System.out.println("Circumference of Circle is : " + circumference);
        System.out.println("Area of Circle is : " + area);
    }

    static double findCircumference(double radius){
        final double PI = 3.14;
        double circumference = 2 * PI * radius;
        return circumference;

    }

    static double findArea(double radius){
        final double PI = 3.14;
        double area = PI * radius * radius;
        return area;
    }
}
