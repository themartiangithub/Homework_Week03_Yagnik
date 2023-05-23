package homework_week03_yagnik;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {
     m1();
    }
    public static void m1(){
        // Numeric array
        int[] numbers = {10, 8, 9, 6, 7, 4, 5, 2, 3, 1};

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("The Sorted numeric Array is :");
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " \n");
        }

        System.out.println();

        // String array
        String[] cars = {"Hyundai", "Toyota", "Mahindra", "Tata", "Mercedes"};

        // Sort the array
        Arrays.sort(cars);

        // Print the sorted array
        System.out.println("The Sorted string array is : ");
        for (int a = 0; a<cars.length; a++) {
            System.out.print(cars[a] + " \n");
        }
    }
}
