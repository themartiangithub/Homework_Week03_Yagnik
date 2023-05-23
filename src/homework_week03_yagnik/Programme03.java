package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Programme03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1(sc);
    }

    public static void m1(Scanner sc) {
        //get student name
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        //get roll number
        System.out.print("Enter Student Roll Number : ");
        int rollnumber = sc.nextInt();

        //get student marks
        System.out.print("Enter Maths Marks : ");
        int maths = sc.nextInt();
        System.out.print("Enter Science Marks : ");
        int science = sc.nextInt();
        System.out.print("Enter English Marks : ");
        int english = sc.nextInt();

        //checking marks range
        if (maths < 0 || maths > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }

        if (science < 0 || science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }

        if (science < 0 || science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }

        //find total, percentage, and result
        int total = maths + science + english;
        double percentage = total * 100 / 300;
        System.out.println(percentage);
        String result = "Fail";
        if (percentage >= 35) {
            result = "Pass";
        }

        //assign grades
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println(" _______________________________");
        System.out.println("|                               |");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_______________________________|");
        System.out.println("|       Name: "+name+"             |");
        System.out.println("|    Roll No: "+rollnumber+"                |");
        System.out.println("|_______________________________|");
        System.out.println("|   Subjects:   Marks           |");
        System.out.println("|_______________________________|");
        System.out.println("|      Maths: "+maths+"                |");
        System.out.println("|    Science: "+science+"                |");
        System.out.println("|    English: "+english+"                |");
        System.out.println("|_______________________________|");
        System.out.println("|      Total: "+total+"               |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage: "+percentage+"              |");
        System.out.println("|     Result: "+result+"              |");
        System.out.println("|      Grade: "+grade+"                 |");
        System.out.println("|_______________________________|");

    }
}
