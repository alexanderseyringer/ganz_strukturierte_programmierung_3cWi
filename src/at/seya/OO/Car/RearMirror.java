package at.seya.OO.car;

public class RearMirror {
    private int size;
    private int position;

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public int getPosition() {
        return position;
    }

    public void movement() {
        if(this.position == -10) {
            System.out.println("Der Spiegel bewegt sich nach links...");
        }
        if(this.position == 10) {
            System.out.println("Der Spiegel bewegt sich nach rechts...");
        }
        else {
            System.out.println("Der Spiegel bleibt in seiner Ausgangsposition!");
        }
    }

}
