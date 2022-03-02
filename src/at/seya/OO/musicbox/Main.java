package at.seya.OO.musicbox;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song(4.3, "BlackWidow");
        Song s2 = new Song(9.1, "YellowHoney");
        Song s3 = new Song(9.2, "RedRaspberry");
        Song s4 = new Song(7.1, "BlueBerry");

        Record r1 = new Record(01, "Debussy's Best");
        Record r2 = new Record(02, "Debussy's Almost Best");
        Record r3 = new Record(03, "All that Jazz");

        r1.addSong(s1);
        r2.addSong(s2);
        r2.addSong(s3);
        r3.addSong(s4);

        Magazine m1 = new Magazine(50);

        m1.addRecord(r1);
        m1.addRecord(r2);
        m1.addRecord(r3);

        Player rp1 = new Player(m1);

        Musicbox wurlitzer = new Musicbox(m1, "Wurlitzer Soundmaster 6000", rp1);

       // wurlitzer.removeRecord(2);

        wurlitzer.getSumOfMusicLength();

        wurlitzer.searchRecord("All that Jazz");

        wurlitzer.loadRecord("All that Jazz");
        wurlitzer.play(1);
    }
}
