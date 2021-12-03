package at.seya.strukturierteProgrammierung.arrays;

import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        String ersteWort = "Lukas";

        char[] geheimeWort = new char[ersteWort.length()];
        for (int i = 0; i < geheimeWort.length; i++) {
            geheimeWort[i] = '*';
        }

        char[] preselectedWord = ersteWort.toCharArray();

        Scanner scammerinput = new Scanner(System.in);

        boolean win = false;
        char userInput;

        int userErrors = 0;
        boolean userdiderror = false;
        boolean userdidsomethingright = false;

        String ganzeWort = "";

        System.out.println("Herzlichen Willkommen bei Hangman!");
        System.out.println("Es ist ganz einfach: die Sterne stehen jeweils für einen Buchstaben und du must nun in 6 Runden das Wort erraten, sonst hast du Verloren.");

        while(win == false){

            System.out.println(" ");
            System.out.println("Das hast du bereits erraten: ");

            for (int i = 0; i < geheimeWort.length; i++) {
                System.out.print(geheimeWort[i]);
            }

            System.out.println(" ");
            System.out.println("Bitte gib nun deinen Lösungsansatz ein!");

            userInput = scammerinput.next().charAt(0);

            for (int i = 0; i < preselectedWord.length; i++) {
                if (preselectedWord[i] == userInput){
                    geheimeWort[i] = preselectedWord[i];
                    // System.out.println("Wenn des funktioniert friss i an besa");
                    userdidsomethingright = true;
                }
            }

            if(userdidsomethingright == false){
                System.out.println("Es goht ne");

                userErrors = userErrors + 1;

                System.out.println("Oh nein! du hast etwas falsch gemacht! Das ist jetzt fehler " + userErrors + "/6!");
            }

            for (int ie = 0; ie < geheimeWort.length; ie++) {
                ganzeWort = ganzeWort + geheimeWort[ie];
            }

            if(ganzeWort.contains("*")) {
                ganzeWort = "";
            }

            else {
                System.out.println("Du hast alles erraten! Glückwunsch!");
                win = true;
            }

            if(userErrors == 6) {
                System.out.println("Oh nein! Du hast verloren!");
                break;
            }


        }






    }
}