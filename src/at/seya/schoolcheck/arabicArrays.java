package at.seya.schoolcheck;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class arabicArrays {
    public static void main(String[] args) {
        boolean finished = false;

        while(finished == false){
            Scanner scammer = new Scanner(System.in);
            Random randomizer2000 = new Random();
            System.out.println("Hallo! Bitte gib an wie viele Sätze du gerne hättest! (Achtung: Es sind nur Zahlen erlaubt!)");

            int sentencesCount = scammer.nextInt();

            String[] anrede = {"Er ", "Sie "};
            String[] action = {"geht ", "läuft ", "rennt ", "fährt "};
            String[] location = {"nach Hause.", "zur Schule.", "ins Büro.", "auf die Party."};

            for (int i = 0; i < sentencesCount; i++) {
                int randomizerAnrede = randomizer2000.nextInt(2);
                int randomizerAction = randomizer2000.nextInt(4);
                int randomizerLocation = randomizer2000.nextInt(4);
                System.out.println(anrede[randomizerAnrede] + action[randomizerAction] + location[randomizerLocation]);
            }

            System.out.println("Noch eine Runde (1) oder lieber aufhören (2)?");

            int playAgain = scammer.nextInt();

            if(playAgain == 2) {
                finished = true;
            }
        }

    }

}
