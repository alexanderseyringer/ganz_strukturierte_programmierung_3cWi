package at.seya.strukturierteProgrammierung.bankautomat;

import java.util.Scanner;

public class bankautomat {
    public static void main(String[] args) {
        int accountBalance = 40;

        Scanner scanner = new Scanner(System.in);

        int input = 0;

        while(input != 4) {

            print();

            input = scanner.nextInt();

            if(input == 1) {
                System.out.println("Der Kontostand beträgt: " + accountBalance);
                System.out.println("Bitte geben Sie den gewünschten Betrag ein:");

                int input_pay_in = scanner.nextInt();

                accountBalance = accountBalance +  input_pay_in;

                System.out.println("Erfolgreich eingezahlt! Der Kontostand beträgt nun: " + accountBalance);
            }

            else if(input == 2) {
                System.out.println("Der Kontostand beträgt: " + accountBalance);
                System.out.println("Bitte geben Sie den gewünschten Abhebungsbetrag ein:");

                int input_pay_out = scanner.nextInt();

                accountBalance = accountBalance +  input_pay_out;

                System.out.println("Erfolgreich ausgezahlt! Der Kontostand beträgt nun: " + accountBalance);

            }

            else if(input == 3) {
                System.out.println("Der Kontostand beträgt: " + accountBalance);

                System.out.println("Einen schönen Tag noch!");

            };
        };


    }

    public static void print() {
        System.out.println("Bitte treffe deine Auswahl:");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Meltdown");
        System.out.println("5. Abbruch");
    }
}
