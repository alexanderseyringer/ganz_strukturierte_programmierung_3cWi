package at.seya.OO.calculator;

public class Main {
    public static void main(String[] args) {

        BasicCalculator c1 = new BasicCalculator("TexasInstruments", "TI-690-Lite", "PurionWite");

        c1.addition(1, 2);
        c1.subtracation(2, 1);

        ScientificCalculator s1 = new ScientificCalculator("TexasInstruments", "TI-30X Pro MultiView", "JustBlack");

        s1.cosCalc(30);

        RootCalculator r1 = new RootCalculator("TexasInstruments", "TI-30XB MultiView", "FPÖ-Blue");

        r1.rootCalc(4);
    }


}
