package at.seya.OO.ticketMachine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TicketMachine {
    private Controller controller;
    private boolean inserted = false;
    private int insertedTicketNumber;

    public TicketMachine(Controller controller) {
        this.controller = controller;
        this.inserted = inserted;
        this.insertedTicketNumber = insertedTicketNumber;
    }

    public Controller getController() {
        return controller;
    }

    public boolean isInserted() {
        return inserted;
    }

    public int getInsertedTicketNumber() {
        return insertedTicketNumber;
    }

    public void getTicket() {
       int newID = this.controller.getTicketList().size() + 1;
       Ticket ticket = new Ticket(newID);
       this.controller.addTicket(ticket);
    }

    public void insertTicket(int TicketID) {
        this.inserted = true;
        this.insertedTicketNumber = TicketID;
    }
}
