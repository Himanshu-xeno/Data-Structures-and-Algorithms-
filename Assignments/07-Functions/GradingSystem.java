//8. Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Marks for English: ");
        int eng = in.nextInt();

        System.out.print("Enter the Marks for Hindi: ");
        int hindi = in.nextInt();

        System.out.print("Enter the Marks for Science: ");
        int sci = in.nextInt();

        System.out.print("Enter the Marks for Maths: ");
        int math = in.nextInt();

        System.out.print("Enter the Marks for History: ");
        int hist = in.nextInt();

        System.out.print("Enter the Marks for Geography: ");
        int geo = in.nextInt();

        // Call grading method for each subject
        marksGrading(eng, "English");
        marksGrading(hindi, "Hindi");
        marksGrading(sci, "Science");
        marksGrading(math, "Maths");
        marksGrading(hist, "History");
        marksGrading(geo, "Geography");

        // Call grading method for each subject
        gradeBySwitch(eng, "English");
        gradeBySwitch(hindi, "Hindi");
        gradeBySwitch(sci, "Science");
        gradeBySwitch(math, "Maths");
        gradeBySwitch(hist, "History");
        gradeBySwitch(geo, "Geography");
    }

    //brute-force grading system
    static void marksGrading(int marks, String subject) {
        System.out.print(subject + " Grade: ");
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 70) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 50) {
            System.out.println("D");
        } else if (marks >= 40) {
            System.out.println("E");
        } else {
            System.out.println("F (Fail)");
        }
    }

    //Switch based grading system
    static void gradeBySwitch(int marks, String subject) {
        System.out.print(subject + " Grade: ");

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        int grade = marks / 10;

        switch (grade) {
            case 10:
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            case 4:
                System.out.println("E");
                break;
            default:
                System.out.println("F (Fail)");
        }
    }
}
