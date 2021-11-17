package at.seya.strukturierteProgrammierung.arrays;

public class CaesarVerschluesselung {
    public static void main(String[] args) {

        String text = "Hanz";
        char[] input = text.toCharArray();

        for (int i = 0; i < input.length; i++) {
            char move = 2;
            char nChar = (char) (input[i] + move);
            if (nChar > 122) {
                nChar -= 26;
            }
            System.out.print(nChar);
        }

    }
}
