package at.seya.OO.musicbox;

public class Song {
    private double length;
    private String name;

    public Song(double length, String name) {
        this.length = length;
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }
}
