package decision_structures;

import java.util.Scanner;

public class DollarGame {

    public static void main (String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the Number of Pennies: ");
        int pennies = scanner.nextInt();

        System.out.println("Please provide the Number of Nickels: ");
        int nickels = scanner.nextInt() * 5 ;

        System.out.println("Please provide the Number of Dimes: ");
        int dimes = scanner.nextInt() * 10;

        System.out.println("Please provide the Number of Quarters: ");
        int quarters = scanner.nextInt() * 25;

        int total = pennies + nickels + dimes + quarters;

        if (total > 1){
            int difference = total-1;
            System.out.println ("You lost. Total is more than $1 by " + difference);
        } else if (total <1 ){
            int difference = 1- total;
            System.out.println ("You lost. Total is less than $1 by $0." + difference);
        }else {
            System.out.println ("Congratulations. Total is $1");
        }
    }
}
