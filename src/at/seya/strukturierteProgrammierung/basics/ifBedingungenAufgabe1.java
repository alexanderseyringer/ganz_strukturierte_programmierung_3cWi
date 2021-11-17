package at.seya.strukturierteProgrammierung.basics;


import java.util.Random;

public class ifBedingungenAufgabe1 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.println(randomNumber);
        // Wenn die ;Zahl kleiner ist als 20  gib aus "Mini"
        if (randomNumber < 20) {
            System.out.println("mini");
        }

        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        else if ((randomNumber > 20) && (randomNumber < 50)) {
            System.out.println("medium");
        }

        // Wenn die Zahl größer als 50 ist gib aus "Large"
        else if (randomNumber > 50){
            System.out.println("large");
        }
    }
}
