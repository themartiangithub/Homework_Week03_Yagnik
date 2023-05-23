package homework_week03_yagnik;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme05 {
    public static void main(String[] args) {
        //Creating scanner object
        Scanner sc = new Scanner(System.in);
        salarySlip(sc);
    }

    public static void salarySlip(Scanner sc){
        //Get employee id
        System.out.print("Enter Employee's Id : ");
        int empId = sc.nextInt();
        //Get employee name
        System.out.print("Enter Employee's Name : ");
        String empName = sc.next();
        // Get employee basic salary
        System.out.print("Enter Employee's basic salary : ");
        int basicSalary = sc.nextInt();

        // Calculate the HRA
        double HRA = basicSalary * 0.10;
        // Calculate the DA
        double DA = basicSalary * 0.08;
        // Calculate the TA
        double TA = basicSalary * 0.09;
        // Calculate the PF
        double PF = basicSalary * 0.20;
        // Calculate the Gross salary
        double grossSalary = basicSalary + HRA + DA + TA - PF;

        // Print the salary slip
        System.out.println("________________________________");
        System.out.println("|          Salary Slip         |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id   : " + empId + "           |");
        System.out.println("| Employee Name : " + empName + "       |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary  : " + basicSalary + "        |");
        System.out.println("| HRA 10%       : " + HRA + "       |");
        System.out.println("| TA 8%         : " + TA + "       |");
        System.out.println("| DA 9%         : " + DA + "       |");
        System.out.println("| PF - 20&      : " + PF + "       |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary  : " + grossSalary + "      |");
        System.out.println("|==============================|");

    }

}

