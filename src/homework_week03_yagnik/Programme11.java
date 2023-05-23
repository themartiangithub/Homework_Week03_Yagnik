package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 3 or 5 : ");
        int num = sc.nextInt();
        m1(num);
    }

    public static void m1(int num) {
        // Print the numbers between 1 to 100 which can be divided by 3 and 5 separately
        switch (num) {
            case 3:
                for (int i = 1; i <= 100; i++) {
                    if (i % 3 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 5:
                for (int i = 1; i <= 100; i++) {
                    if (i % 5 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("Invalid Number.");
        }
    }
}