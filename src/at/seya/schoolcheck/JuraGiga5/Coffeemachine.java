package at.seya.schoolcheck.JuraGiga5;

import java.util.Scanner;

public class Coffeemachine {
    private Controller controller;

    public Coffeemachine(Controller controller) {
        this.controller = controller;
    }

    Scanner scammer = new Scanner(System.in);

    public void standardProgramm() {
        int input = 0;
        boolean isOperating = true;

        while (isOperating) {
            if (this.controller.isSwitchedOn() == false) {
                System.out.println("Herzlich Willkommen beim Standard-Programm!");
                System.out.println("Das Gerät ist gerade ausgeschaltet!");
                System.out.println("1) Einschalten");
                System.out.println("2) Beenden");

                input = scammer.nextInt();

                if (input == 1) {
                    controller.switchOn();
                }

                else {
                    isOperating = false;
                }


            }

            else {
                System.out.println(" ");
                System.out.println("Du bist gerade im Hauptmenü! Dir stehen folgende Optionen zur Verfügung:");

                System.out.println("1) Kaffee zubereiten");
                System.out.println("2) Das Gerät ausschalten");
                System.out.println("3) Kaffeegröße ändern");
                System.out.println("4) Mahlgrad einstellen");
                System.out.println("5) Wasser nachfüllen");
                System.out.println("6) Kaffeebohnen nachfüllen");
                System.out.println("7) Programm beenden");

                input = scammer.nextInt();

                if (input == 1) {
                    controller.getJava();
                }

                if (input == 2) {
                    controller.switchOff();
                    isOperating = false;
                }

                if (input == 3) {
                    System.out.println("Bitte gib die hinzuzufügende Menge ein!");
                    input = scammer.nextInt();
                    controller.setCoffeeSize(input);
                }

                if (input == 4) {
                    System.out.println("Bitte gib den Mahlgrad ein!");
                    input = scammer.nextInt();
                    controller.setDegreeOfGrinding(input);
                }

                if (input == 5) {
                    System.out.println("Bitte gib die hinzuzufügende Menge ein!");
                    input = scammer.nextInt();
                    controller.fillWaterTank(input);
                }

                if (input == 6) {
                    System.out.println("Bitte gib die hinzuzufügende Menge ein!");
                    input = scammer.nextInt();
                    controller.refillBeans(input);
                }

                if (input == 7) {
                    isOperating = false;
                }

                /* else {
                    System.out.println("Diese Zahl stand nicht zur Auswahl!");
                } */

            }

        }



    }
}
