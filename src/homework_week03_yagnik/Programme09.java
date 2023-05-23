package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement.
 */
public class Programme09 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Get alphabet from the User
        System.out.print("Enter an alphabet from A to F : ");
        char alphabet = sc.next().charAt(0);
        alphabet(alphabet);
    }

    public static void alphabet(char alphabet){
        switch (alphabet) {
            case 'A':
                System.out.println("The city name is Ahmedabad.");
                break;
            case 'B':
                System.out.println("The city name is Bangalore.");
                break;
            case 'C':
                System.out.println("The city name is Chennai.");
                break;
            case 'D':
                System.out.println("The city name is Delhi.");
                break;
            case 'E':
                System.out.println("The city name is Hyderabad.");
                break;
            case 'F':
                System.out.println("The city name is Pune.");
                break;
            default:
                System.out.println("Invalid Entry.");
        }
    }
}
