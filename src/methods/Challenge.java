package methods;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        int salary = scanner.nextInt();

        System.out.println("Please enter your credit score: ");
        int score = scanner.nextInt();

        boolean result = isQualified(salary, score);
        printMessage(result);

    }

    //create a method to see if the user qualify for a loan
    public static boolean isQualified (int userSalary, int userScore){
        int requiredSalary = 2500;
        int requiredScore  = 700;

        if (userSalary >= requiredSalary && userScore >= requiredScore){
            return true;
        } else {
            return false;
        }
    }

    public static void printMessage(boolean result){
        if (result){
            System.out.println("Congrats, you are approved");
        } else {
            System.out.println("Sorry, you are not approved.");
        }
    }
}
