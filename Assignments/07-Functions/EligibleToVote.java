//3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the age of voter : ");
        int age = in.nextInt();

        findEligible(age);
    }

    static void findEligible(int n){
        int age = n;
        if(age >= 18){
            System.out.println("The person is eligible to cast vote.");
        }else{
            System.out.println("The person is not eligible to cast vote.");
        }
    }
}
