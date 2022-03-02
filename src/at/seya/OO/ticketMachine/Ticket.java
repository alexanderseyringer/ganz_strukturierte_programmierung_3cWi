package at.seya.OO.ticketMachine;

public class Ticket {
    private int id;
    private String createdTime;
    private String payedTime;

    public Ticket(int id, String createdTime) {
        this.id = id;
        this.createdTime = createdTime;
        this.payedTime = payedTime;
    }

    public int getId() {
        return id;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public String getPayedTime() {
        return payedTime;
    }
}
