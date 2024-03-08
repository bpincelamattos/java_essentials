package content1;

import java.util.Scanner;

public class StoryExercise {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a Season of the year");
        String season = scanner.next();
        System.out.println("Please provide a Whole Number");
        int number = scanner.nextInt();
        System.out.println("Please provide an adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("It was a beautiful morning of " + season +
                " when " + number + " " + adjective + " dogs started to bark");
    }
}
