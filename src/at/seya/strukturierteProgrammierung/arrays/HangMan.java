package at.seya.strukturierteProgrammierung.arrays;

import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        String ersteWort = "Peta";
        String geheimeWort ="";
        for (int i = 0; i < ersteWort.length(); i++) {
            geheimeWort += "*";
        }

          char[] preselected = ersteWort.toCharArray(); // Zeug ausm String in ein Array schreiben
        for (int i = 0; i < preselected.length; i++) {
           // System.out.print(preselected[i]);     Inhalt vom Array ausgeben -> Nur für Testzwecke
        }

        Scanner scammerinput = new Scanner(System.in);

        // Hier irgendwie nen loop hinklatschen oder so

        System.out.println("Herzlichen Willkommen bei Hangman");

        System.out.println(geheimeWort);

        System.out.println("Bitte gib nun deinen Lösungsansatz ein!");

        char[] userinput = new char[4];
        for (int i = 0; i < 4; i++) {

        }


    }
}