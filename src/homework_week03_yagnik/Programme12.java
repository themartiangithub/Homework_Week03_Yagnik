package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        m1(sc);
    }

    public static void m1(Scanner sc) {
        // Get the input from the user
        System.out.print("Enter a Value : ");
        char input = sc.next().charAt(0);

        // Check if the input is a number, an alphabet, or symbol
        if (Character.isDigit(input)) {
            System.out.println("The input is a number.");
        } else if (Character.isAlphabetic(input)) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a symbol.");
        }
    }
}
