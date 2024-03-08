package decision_structures;

public class Test {

    public static void main(String[] args){
        reverseWord("STOP");

    }

    public static void reverseWord (String word){

        for (int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
