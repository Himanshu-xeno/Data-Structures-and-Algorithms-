import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The entered array elements are : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
