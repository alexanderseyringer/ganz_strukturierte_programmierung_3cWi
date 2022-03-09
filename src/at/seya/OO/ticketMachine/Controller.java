package at.seya.OO.ticketMachine;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Ticket> ticketList;
    private double tarif;
    private double preis;

    public Controller(double tarif) {
        this.ticketList = new ArrayList<>();
        this.tarif = tarif;
        this.preis = preis;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public double getTarif() {
        return tarif;
    }

    public double getPreis() {
        return preis;
    }

    public void addTicket(Ticket ticketlist) {
        this.ticketList.add(ticketlist);

    }
}
