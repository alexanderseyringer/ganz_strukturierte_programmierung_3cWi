package at.seya.OO.ticketMachine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TicketMachine {
    private Controller controller;

    public TicketMachine(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }

    public void getTicket() {
       DateFormat df = new SimpleDateFormat("HH:mm:ss");
       int newID = this.controller.getTicketList().size() + 1;
       Ticket ticket = new Ticket(newID, )
    }
}
