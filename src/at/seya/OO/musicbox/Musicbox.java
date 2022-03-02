package at.seya.OO.musicbox;

public class Musicbox {
    private Magazine magazine;
    private String name;
    private Player player;

    public Musicbox(Magazine magazine, String name, Player player) {
        this.magazine = magazine;
        this.name = name;
        this.player = player;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public String getName() {
        return name;
    }

    public void removeRecord(int selectedRecord) {
        this.magazine.removeRecord(selectedRecord);
    }

    public void getSumOfMusicLength() {
        System.out.println("Die Summe aller Titel auf allen Schallplatten beträgt: " + this.magazine.getSumOfRecordLength());
    }

    public void searchRecord(String recordTitle) {
        System.out.println("Die Schallplatte befindet sich auf Position  " + this.magazine.newSearchRecord(recordTitle));
    }

    public void loadRecord(String recordTitle) {
        this.player.loadRecord(recordTitle);
    }

    public void play(int num) {
        this.player.play(num);
    }
}
