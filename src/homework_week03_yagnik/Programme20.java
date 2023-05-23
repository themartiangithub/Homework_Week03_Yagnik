package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check(sc);
    }
    public static void check(Scanner sc){
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the value to check : ");
        int value = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                found = true;
                break;
            }
        }

        if (found == true) {
            System.out.println("The value " + value + " is in the array.");
        } else {
            System.out.println("The value " + value + " is not in the array.");
        }
    }

}
