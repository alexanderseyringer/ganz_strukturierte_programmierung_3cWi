package at.seya.strukturierteProgrammierung.arrays;

import java.util.Scanner;

public class TicTacToeRevisited {
    public static void main(String[] args) {
        int input = 0;

        int[][] tictactoeArray = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        boolean win = false;
        boolean player1win = false;
        boolean player2win = false;

        while (win == false) {

            System.out.println("Das Spiel ist ganz einfach: Am Anfang einer Runde wird dir das Spielfeld angezeigt, eine 0 ist ein leeres Feld, eine 1 steht für Spieler 1 usw.");

            for (int row = 0; row < tictactoeArray.length; row++) {
                for (int col = 0; col < tictactoeArray.length; col++) {
                    System.out.print(tictactoeArray[row][col] + " ");
                }
                System.out.println();
            }

            System.out.println("Hallo Spieler 1! Gib bitte deine Zeile an!");
            int playerinput1 = scanner.nextInt();
            System.out.println("Gib nun bitte deine Spalte an!");
            int playerinput2 = scanner.nextInt();

            tictactoeArray[playerinput1][playerinput2] = 1;

            for (int row = 0; row < tictactoeArray.length; row++) {
                for (int col = 0; col < tictactoeArray.length; col++) {
                    System.out.print(tictactoeArray[row][col] + " ");
                }
                System.out.println();
            }

            System.out.println("Hallo Spieler 2! Gib bitte deine Zeile an!");
            int playerinput3 = scanner.nextInt();
            System.out.println("Gib nun bitte deine Spalte an!");
            int playerinput4 = scanner.nextInt();

            tictactoeArray[playerinput3][playerinput4] = 2;


            // Win conditions Player 1
            // 1 Waagrecht
            if (tictactoeArray[0][0] == 1) {
                if (tictactoeArray[1][0] == 1) {
                    if (tictactoeArray[2][0] == 1) {
                        win = true;
                        player1win = false;
                    }
                }
            }

            // 1 Senkrecht
            if (tictactoeArray[0][0] == 1) {
                if (tictactoeArray[0][1] == 1) {
                    if (tictactoeArray[0][2] == 1) {
                        win = true;
                        player1win = false;
                    }
                }
            }

            // 2 Waagrecht
            if (tictactoeArray[0][1] == 1) {
                if (tictactoeArray[1][1] == 1) {
                    if (tictactoeArray[2][1] == 1) {
                        win = true;
                        player1win = false;
                    }
                }
            }

            // 2 Senkrecht
            if (tictactoeArray[1][0] == 1) {
                if (tictactoeArray[1][1] == 1) {
                    if (tictactoeArray[1][2] == 1) {
                        win = true;
                        player1win = false;
                    }
                }
            }

            // 3 Waagrecht
            if (tictactoeArray[0][2] == 1) {
                if (tictactoeArray[1][2] == 1) {
                    if (tictactoeArray[2][2] == 1) {
                        win = true;
                        player1win = false;
                    }
                }
            }

            // 3 Senkrecht
            if (tictactoeArray[2][0] == 1) {
                if (tictactoeArray[2][1] == 1) {
                    if (tictactoeArray[2][2] == 1) {
                        win = true;
                        player1win = false;
                    }
                }
            }

            // Player 2 Win conditons
            if (tictactoeArray[0][0] == 2) {
                if (tictactoeArray[1][0] == 2) {
                    if (tictactoeArray[2][0] == 2) {
                        win = true;
                        player2win = false;
                    }
                }
            }

            // 1 Senkrecht
            if (tictactoeArray[0][0] == 2) {
                if (tictactoeArray[0][1] == 2) {
                    if (tictactoeArray[0][2] == 2) {
                        win = true;
                        player2win = false;
                    }
                }
            }

            // 2 Waagrecht
            if (tictactoeArray[0][1] == 2) {
                if (tictactoeArray[1][1] == 2) {
                    if (tictactoeArray[2][1] == 2) {
                        win = true;
                        player2win = false;
                    }
                }
            }

            // 2 Senkrecht
            if (tictactoeArray[1][0] == 2) {
                if (tictactoeArray[1][1] == 2) {
                    if (tictactoeArray[1][2] == 2) {
                        win = true;
                        player2win = false;
                    }
                }
            }

            // 3 Waagrecht
            if (tictactoeArray[0][2] == 2) {
                if (tictactoeArray[1][2] == 2) {
                    if (tictactoeArray[2][2] == 2) {
                        win = true;
                        player2win = false;
                    }
                }
            }

            // 3 Senkrecht
            if (tictactoeArray[2][0] == 2) {
                if (tictactoeArray[2][1] == 2) {
                    if (tictactoeArray[2][2] == 2) {
                        win = true;
                        player2win = false;

                    }
                }
            }

        }

        if(player1win = true) {
            System.out.println("Glückwunsch Spieler 1 du hast Gewonnen!");
        }

        if(player2win = true) {
            System.out.println("Glückwunsch Spieler 2 du hast Gewonnen!");
        }




    }
}


