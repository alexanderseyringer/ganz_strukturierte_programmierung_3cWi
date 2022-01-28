package at.seya.strukturierteProgrammierung.arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] throwsArray = new int[6]; //Array erstellen

        throwsArray[4] = 69; //Wert einfügen

        System.out.println(throwsArray[4]); //Einzelnen wert im Array ausgeben

        for (int i = 0; i < throwsArray.length; i++) { //Zählt die gesamte Länge des arrays nach oben
            System.out.println(throwsArray[i]);

            int[][] playGround = new int[3][3]; //Array mit mehren Zeilen und Spalten erstellen

            playGround[0][0] = 1;

            for (int row = 0; row < playGround.length; row++) {
                for (int col = 0; col < playGround.length; col++) {
                    System.out.print(playGround[row][col] + " ");
                }
                System.out.println();
            }
        }
    }
}
