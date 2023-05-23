package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        calculator(sc);
    }

    public static void calculator(Scanner sc){
        // Get the first number from the user
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        // Get the second number from the user
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        // Get the symbol from the user
        System.out.print("Enter the symbol (+, -, *, /): ");
        char symbol = sc.next().charAt(0);

        // Calculate the result
        double result;
        if (symbol == '+') {
            result = firstNumber + secondNumber;
        } else if (symbol == '-') {
            result = firstNumber - secondNumber;
        } else if (symbol == '*') {
            result = firstNumber * secondNumber;
        } else if (symbol == '/') {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Invalid symbol.");
            return;
        }

        // Print the result
        System.out.println("The result is: " +result);
    }
}
