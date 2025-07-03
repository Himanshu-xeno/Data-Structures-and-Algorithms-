import java.util.Scanner;

public class NumberHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] hash = new int[13];    // Only supports values from 0 to 12

        for (int i = 0; i < n; i++)
            hash[arr[i]]++;

//        System.out.println("Enter the number of queries: ");
//        int q = sc.nextInt();

//        while (q-- > 0) {
//            System.out.println("Enter the number to query: ");
//            int num = sc.nextInt();
//            System.out.println("The count of number " + num + " is: " + hash[num]);
//        }

        // 🔁 This part runs the query only once:
        System.out.println("Enter the number to query: ");
        int num = sc.nextInt();
        System.out.println("The count of number " + num + " is: " + hash[num]);

    }
}
