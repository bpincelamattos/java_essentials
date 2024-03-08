package repetitionStructures;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourSalary = 15;
        int maxHours = 40;

        System.out.println("Weekly hours worked: ");
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while (hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double totalSalary = hoursWorked * hourSalary;
        System.out.println("Your Salary is: " + totalSalary);

    }
}
