package whileLoops;

import java.util.Scanner;

public class whileLoopVoorbeeld1 {
    public static void main(String[] args) {
        //user input opzetten
        Scanner input = new Scanner(System.in);
        boolean songIsOnRepeat = true;
        while (songIsOnRepeat) {
            // communiceer met gebruiker
            System.out.println("song is on repeat");
            System.out.println("do you want this song off of repeat");
            String userInput = input.next();

            // if statement om te checken of de user het nummer van repeat wil verwijderen, en de boolean dus op false moet
            if (userInput.equals("yess")) {
                songIsOnRepeat = false;
            }
        }
        System.out.println("we took the song of repeat, playing next song");
    }
}
