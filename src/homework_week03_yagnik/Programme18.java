package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
        //Create scanner object
        Scanner sc = new Scanner(System.in);
        sum(sc);
    }
    public static void sum(Scanner sc){
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
            //sum = sum + array[i];
        }
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
