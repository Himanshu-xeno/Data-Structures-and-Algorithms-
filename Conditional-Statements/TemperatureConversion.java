import java.util.Scanner;
public class TemperatureConversion{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temperature in degree celsius : ");
        int celsius = in.nextInt();

        int fr = (celsius * 9/5 )+ 32;
        System.out.println("The Temperature in Fahrenheit :  " +fr);
    }

}