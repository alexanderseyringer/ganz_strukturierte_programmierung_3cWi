package at.seya.strukturierteProgrammierung.basics;

import java.util.Random;

public class whileAufgabe1 {
    public static void main(String[] args) {
        Random random1 = new Random();
        boolean isFinished = false;



        // Das Programm soll die Zufallszahlen zusammenzählen. Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!
        while (isFinished) {
            int randomNumber1 = random1.nextInt(10)+30;
            System.out.println("Zufallszahl: " + randomNumber1);

            if ((randomNumber1 == 15) || (randomNumber1 == 25)) {
                isFinished=true;
            };
        }

        System.out.println("Finished");
    }
}
