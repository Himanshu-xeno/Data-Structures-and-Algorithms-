import java.util.Arrays;
import java.util.Scanner;
public class StringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[4];

        System.out.print("Enter the string elements in the array: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.print(" The string elements in the array are : ");
        //        for(String j : str){
        //   System.out.print(j+ " ");
        // }
        System.out.println(Arrays.toString(str));
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));

    }
}
