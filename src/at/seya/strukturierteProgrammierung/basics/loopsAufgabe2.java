package at.seya.strukturierteProgrammierung.basics;

import java.util.Random;

public class loopsAufgabe2 {
    public static void main(String[] args) {
        Random random1 = new Random();

        int randomNumber1 = random1.nextInt(10);

        //For Schleife 1-100
        for (int i = 2; i < 101; i+= 2) {
            System.out.println(i);
        }
    }
}
