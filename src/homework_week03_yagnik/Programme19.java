package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        average(sc);
    }
    public static void average(Scanner sc){
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        double average = sum / size;

        System.out.println("The average value of the elements in the array is: " + average);
    }
}
