package at.seya.OO.musicbox;

public class Player {
    private Record record;
    private Magazine magazine;
    private Boolean loaded = false;
    private int loadedRecordNumber;

    public Player(Magazine magazine) {
        this.record = record;
        this.magazine = magazine;
        this.loaded = loaded;
        this.loadedRecordNumber = loadedRecordNumber;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public Boolean getLoaded() {
        return loaded;
    }

    public int loadRecord(String recordTitle) {
        this.loaded = true;
        this.loadedRecordNumber = this.magazine.newSearchRecord(recordTitle);
       return loadedRecordNumber;
    }

    public void play(int num) {
        if (this.loaded == true) {
            System.out.println("Es wird der Titel " + this.magazine.getRecordList().get(this.loadedRecordNumber).getSongList().get(num + 1).getName() + " auf der Schallplatte " + this.magazine.getRecordList().get(this.loadedRecordNumber).getName() + " abgespielt.");
        }

        else {
            System.out.println("Es wurde keine Schallplatte eingelegt!");
        }
    }
}
