package at.seya.strukturierteProgrammierung.wuerfelspiel;

import java.util.Random;
import java.util.Scanner;

public class wuerfelspiel {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int beginner;
        int scoreComputer = 0;
        int scorePlayer = 0;
        int scoreDifference;
        int carryOn;

        menuePrint();
        beginner = scanner.nextInt();

        if (beginner == 1) {
            System.out.println("Gute Wahl! Du fängst an");

        } else {
            System.out.println("Gute Wahl! Der Computer beginnt");
        }

        for (int i = 0; i < 6; i++) {
            int diceComputer = random.nextInt(5) + 1;
            int dicePlayer = random.nextInt(5) + 1;

            if (beginner == 1) {
                scorePlayer = scorePlayer + dicePlayer;
                System.out.println("Du hast " + dicePlayer + " gewürfelt");

                scoreComputer = scoreComputer + diceComputer;
                System.out.println("Der Computer hat " + diceComputer + " gewürfelt");

                System.out.println("Möchtest du fortfahren? Gib eine 1 ein.");
                carryOn = scanner.nextInt();

            } else {
                scoreComputer = scoreComputer + diceComputer;
                System.out.println("Der Computer hat " + diceComputer + " gewürfelt");

                scorePlayer = scorePlayer + dicePlayer;
                System.out.println("Du hast " + dicePlayer + " gewürfelt");

                System.out.println("Möchtest du fortfahren? Gib eine Zahl ein.");
                carryOn = scanner.nextInt();

            }


        }
        if (scoreComputer < scorePlayer) {
            scoreDifference = scorePlayer - scoreComputer;
            System.out.println("Herzlichen Glückwunsch du hast mit " + scorePlayer + " gewonnen");
            System.out.println("Das sind " + scoreDifference + " Punkte mehr wie der Computer.");
        } else if (scoreComputer > scorePlayer) {
            scoreDifference = scoreComputer - scorePlayer;
            System.out.println("Ojee du hast leider verloren, nächste Runde wirds besser!");
            System.out.println("Du hast " + scoreDifference + " Punkte weniger erzielt.");

        } else {
            System.out.println("Oh, es gab ein Unentschieden mit jeweils " + scoreComputer + " Punkten.");
        }

    }

    public static void menuePrint() {
        System.out.println("Herzlich Willkommen beim Würfelspiel!");
        System.out.println("Du darfst 6 mal Würfeln, ist deine Augenzahl höher wie die des Computers hast du gewonnen.");
        System.out.println("Wer soll beginnen? Tippe eine 1 für dich oder eine 2 für den Computer!");
    }
}
