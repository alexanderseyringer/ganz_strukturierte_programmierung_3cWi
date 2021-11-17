package at.seya.strukturierteProgrammierung.arrays;

import java.util.Scanner;

public class TicTacToeLegacy {
    public static void main(String[] args) {

        int input = 0;

        int[][] tictactoeArray = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        boolean player2isntplaying = true;

        int theresasFavorit = 0;

        while(theresasFavorit == 0) {

            if(theresasFavorit == 0) {

                for (int row = 0; row < tictactoeArray.length; row++) {
                    for (int col = 0; col < tictactoeArray.length; col++) {
                        System.out.print(tictactoeArray[row][col] + " ");
                    }
                    System.out.println();
                }

                System.out.println("Hallo! Gib bitte deine Zeile an!");
                int playerinput1 = scanner.nextInt();
                System.out.println("Hallo! Gib bitte deine Spalte an!");
                int playerinput2 = scanner.nextInt();

                tictactoeArray[playerinput1][playerinput2] = 1;

                theresasFavorit = 1;


            }

            else if(theresasFavorit == 1) {
                System.out.println("Hallo! Gib bitte deine Zeile an!");
                int playerinput1 = scanner.nextInt();
                System.out.println("Hallo! Gib bitte deine Spalte an!");
                int playerinput2 = scanner.nextInt();

                tictactoeArray[playerinput1][playerinput2] = 2;

                theresasFavorit = 0;
            }
        }



    }
}
