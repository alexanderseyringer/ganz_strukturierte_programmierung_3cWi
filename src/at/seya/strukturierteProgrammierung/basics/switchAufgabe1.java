package at.seya.strukturierteProgrammierung.basics;

import java.util.Random;

public class switchAufgabe1 {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random1 = new Random();

        int randomNumber1 = random1.nextInt(10);

        // Wenn der Wert 10 ist gib aus Ten
        switch (randomNumber1) {
            case 10:
                System.out.println("Ten");
                break;
            // Wenn der Wert 9 ist gib aus Nine
            case 9:
                System.out.println("Nine");
                break;
            // Wenn der Wert 8 ist gib aus Eight
            case 8:
                System.out.println("eight");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 6:
                System.out.println("six");
                break;
            case 5:
                System.out.println("five");
                break;
            case 4:
                System.out.println("four");
                break;
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;
            case 0:
                System.out.println("zero");
                break;
        }
    }
}
