package at.seya.OO.ticketMachine;

import java.util.Date;

public class Ticket {
    private int id;
    private Date startTime;
    private Date endTime;

    public Ticket(int id) {
        this.id = id;
        this.startTime = new Date();
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public Date getCreatedTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
}
