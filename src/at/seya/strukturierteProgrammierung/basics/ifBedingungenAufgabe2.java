package at.seya.strukturierteProgrammierung.basics;

import java.util.Random;

public class ifBedingungenAufgabe2 {
    public static void main(String[] args) {
        // Erstelle zwei Zufallszahlen zwischen 0 und 100

        Random random1 = new Random();

        int randomNumber1 = random1.nextInt(100);

        Random random2 = new Random();

        int randomNumber2 = random2.nextInt(100);

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        if ((randomNumber1 < randomNumber2) && (randomNumber1 < 50)) {
            // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        else if ((randomNumber1 < 30) || (randomNumber2 < 30)) {
            // dann gib aus "Eine der beiden ist kleiner als 30"
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        else if ((randomNumber1 < 50) && (randomNumber2 != 50)) {
            // dann gib aus "Erste Zahl klein, zweite kein 50iger"
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
