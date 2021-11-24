package at.seya.strukturierteProgrammierung.arrays;

import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        String ersteWort = "Peta";
        String geheimeWort ="";
        for (int i = 0; i < ersteWort.length(); i++) {
            geheimeWort += "*";
        }

          char[] preselectedWord = ersteWort.toCharArray(); // Zeug ausm String in ein Array schreiben
        for (int i = 0; i < preselectedWord.length; i++) {
           // System.out.print(preselectedWord[i]);     //Inhalt vom Array ausgeben -> Nur für Testzwecke
        }

        Scanner scammerinput = new Scanner(System.in);

        // Hier irgendwie nen loop hinklatschen oder so

        System.out.println("Herzlichen Willkommen bei Hangman!");
        System.out.println("Es ist ganz einfach: die Sterne stehen jeweils für einen Buchstaben und du must nun in 6 Runden das Wort erraten, sonst hast du Verloren");

        System.out.println(geheimeWort);

        System.out.println("Bitte gib nun deinen Lösungsansatz ein!");




    }
}