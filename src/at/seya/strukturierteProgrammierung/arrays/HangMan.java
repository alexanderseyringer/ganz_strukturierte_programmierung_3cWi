package at.seya.strukturierteProgrammierung.arrays;

import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        String ersteWort = "Peta";

        char[] geheimeWort = new char[ersteWort.length()];
        for (int i = 0; i < geheimeWort.length; i++) {
            geheimeWort[i] = '*';
        }

        char[] preselectedWord = ersteWort.toCharArray(); // Zeug ausm String in ein Array schreiben
          /*  for (int i = 0; i < preselectedWord.length; i++) {
           // System.out.print(preselectedWord[i]);     //Inhalt vom Array ausgeben -> Nur für Testzwecke
        } */

        Scanner scammerinput = new Scanner(System.in);

        boolean win = false;
        char userInput;

        String ganzeWort = "";

        // Hier irgendwie nen loop hinklatschen oder so

        while(win == false){
            System.out.println("Herzlichen Willkommen bei Hangman!");
            System.out.println("Es ist ganz einfach: die Sterne stehen jeweils für einen Buchstaben und du must nun in 6 Runden das Wort erraten, sonst hast du Verloren.");

            for (int i = 0; i < geheimeWort.length; i++) {
                System.out.print(geheimeWort[i]);
            }

            System.out.println(" ");
            System.out.println("Bitte gib nun deinen Lösungsansatz ein!");

            userInput = scammerinput.next().charAt(0);

            // System.out.println(userInput); //Ausgabe ob der Lachs löppt

            // char[] userGuess = userInput.toCharArray();
           /* for (int i = 0; i < userGuess.length; i++) {
                System.out.println(userGuess[i]);
            } */

            for (int i = 0; i < preselectedWord.length; i++) {
                if (preselectedWord[i] == userInput){
                    geheimeWort[i] = preselectedWord[i];
                    // System.out.println("Wenn des funktioniert friss i an besa");
                };
            }

            for (int ie = 0; ie < geheimeWort.length; ie++) {
                ganzeWort = ganzeWort + geheimeWort[ie];
            }

            System.out.println(ganzeWort);
            if(ganzeWort.contains("*")) {
                ganzeWort = "";
            }
            else {
                System.out.println("Du hast alles erraten! Glückwunsch!");
                win = true;
            }

        }






    }
}