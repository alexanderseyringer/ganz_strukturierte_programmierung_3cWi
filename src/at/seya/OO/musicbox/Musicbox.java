package at.seya.OO.musicbox;

public class Musicbox {
    private Magazine magazine;
    private String name;

    public Musicbox(Magazine magazine, String name) {
        this.magazine = magazine;
        this.name = name;
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
        System.out.println("Der gefundene Titel befindet sich auf der Schallplatte " + this.magazine.searchRecord(recordTitle));
    }

}
