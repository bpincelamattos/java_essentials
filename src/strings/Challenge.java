package strings;

import java.util.Scanner;

public class Challenge {
    private static String currentUsername = "johndoe";
    private static String currentPassword = "Abc_1234";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do{

            System.out.println("Please provide a new Password");
            String proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);

        }while (!valid);

        System.out.println("The proposed password is valid");

        scanner.close();

    }

    public static boolean changePassword (String newPassword){
        boolean valid = true;
        String errorMessage = "";

        if (newPassword.length() < 8){
            valid = false;
            errorMessage =  "\nAt least 8 characters long";
        }

        if (!newPassword.matches(".*[A-Z].*")){
            valid = false;
            errorMessage = "\nDoes not contain an uppercase letter";
        }

        if (newPassword.matches("[A-Za-z0-9 ]*")){
            valid = false;
            errorMessage = "\nDoes not contain an special character";
        }
        if (newPassword.toUpperCase().contains(currentUsername.toUpperCase())){
            valid = false;
            errorMessage = "\nYour password cannot contain your username";
        }
        if (newPassword.toUpperCase().contains(currentUsername.toUpperCase())){
            valid = false;
            errorMessage = "\nYour password cannot contain your username";
        }
        if (newPassword.equals(currentPassword)){
            valid = false;
            errorMessage = "\nYour password must be different from your current password";
        }

        if (!valid){
            System.out.println(errorMessage);
        }

        return valid;

    }
}
