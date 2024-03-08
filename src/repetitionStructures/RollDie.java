package repetitionStructures;

import java.util.Random;

public class RollDie {

    public static void main(String[] args) {

        Random random = new Random();

        int spaces = 0;
        int left = 20;

        //loop to roll die 5 times
        for (int i=1; i<6; i++){
            int die = random.nextInt(6) + 1;
            spaces += die;
            left -= die;
            if (spaces > 20){
                System.out.println("Roll #"+ i +": You've rolled a " + die + ". You lost!");
                break;
            } else if (spaces == 20){
                System.out.println("Roll #"+ i +  ": You've rolled a " + die + ". You're on space " + spaces +".Congrats, you win!");
                break;
            }
            System.out.println("Roll #" + i + ": You've rolled a " + die + ". You're on space "+ spaces +" and have " + left + " more to go.");
        }
    }
}
