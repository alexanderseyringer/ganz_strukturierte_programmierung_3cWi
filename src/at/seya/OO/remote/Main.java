package at.seya.OO.remote;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery("Lithium", 79);

        Remote r1 = new Remote();

        r1.addBatteries(b1);
    }
}
