package at.seya.OO.ticketMachine;

import java.util.Date;

public class Ticket {
    private int id;
    private long startTime;
    private long endTime;

    Date createDate = new Date();

    public Ticket(int id) {
        this.id = id;
        this.startTime = createDate.getTime();
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }


    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) { 
        this.endTime = endTime;
    }
}
