package at.seya.OO.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private int id;
    private String name;
    private List<Song> songList;

    public Record(int id, String name) {
        this.id = id;
        this.name = name;
        this.songList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void addSongs(Song songList) {this.songList.add(songList);}

    public double getSumOfSongLength() {
        double songLength = 0;
        int allTitles = this.songList.size();
        for (int i = 0; i < allTitles; i++) {
            songLength = songLength + this.songList.get(i).getLength();
        }
        System.out.println("Für DEGUB Zwecke: " + songLength);
        return songLength;
    }
}
