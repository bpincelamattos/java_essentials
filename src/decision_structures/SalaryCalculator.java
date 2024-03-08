package decision_structures;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //initialize known variables
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for the unknown
        System.out.println("How many sales did you do this week?");
        int sales = scanner.nextInt();
        scanner.close();

        //if statement
        if (sales > quota){
            salary += bonus;
        }

        //output
        System.out.println("Your total salary this week is " + salary);
    }
}
