package at.seya.OO.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private int capacity = 50;
    private List<Record> recordList;

    public Magazine() {
        this.recordList = new ArrayList<>();
    }

    public Magazine(int capacity) {
        this.capacity = capacity;
        this.recordList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Record> getRecordList() {
        return recordList;
    }

    public void addRecord(Record recordList) {
        if(this.recordList.size() < this.capacity) {
            this.recordList.add(recordList);
            System.out.println("Die Schallplatte wurde hinzugefügt! Es sind noch " + this.recordList.size() + " Plätze frei!");
        }

        else {
            System.out.println("Das Magazin ist voll! Bitte entferne ggf. eine Schallplatte!");
        }
    }

    public void removeRecord(int selectedRecord) {
        selectedRecord =-1;
        this.recordList.remove(selectedRecord);
        System.out.println("Die Schallplatte " + selectedRecord + " wurde ausgeworfen!");
    }

    public double getSumOfRecordLength() {
        double recordLength = 0;
        int allRecords = this.recordList.size();
        for (int i = 0; i < allRecords; i++) {
            recordLength = recordLength + this.recordList.get(i).getSumOfSongLength();
        }
        return  recordLength;
    }

    public int searchRecord(String recordTitle) {
        int recordPosition = this.recordList.size();
        int foundRecordPosition = -1;
        for (int i = this.recordList.size(); i > -1 ; i--) {

            if (recordTitle == this.recordList.get(recordPosition).getName()) {
                foundRecordPosition = recordPosition;
            }
            recordPosition--;
        }
        return foundRecordPosition + 1;
    }
}
