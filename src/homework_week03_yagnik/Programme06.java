package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even.
 */
public class Programme06 {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        //Get the number from the user
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        evenOdd(num);
    }

    public static void evenOdd(int num) {

        // Check if the number is odd or even
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd");
        }
    }
}
