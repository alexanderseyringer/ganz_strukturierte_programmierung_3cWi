package at.seya.OO.ticketMachine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TicketMachine {
    private Controller controller;
    private boolean inserted = false;
    private int insertedTicketNumber;
    private ExchangeUnit exchangeUnit;

    public TicketMachine(Controller controller, ExchangeUnit exchangeUnit) {
        this.controller = controller;
        this.inserted = inserted;
        this.insertedTicketNumber = insertedTicketNumber;
        this.exchangeUnit = exchangeUnit;
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

    public int getTicket() {
       int newID = this.controller.getTicketList().size() + 1;
       Ticket ticket = new Ticket(newID);
       this.controller.addTicket(ticket);
       return newID;
    }

    public int insertTicket(int TicketID) {
        this.inserted = true;
        this.insertedTicketNumber = TicketID;
        return TicketID;
    }

    public void getPrice() {
        if(this.isInserted()) {
            Date endDate = new Date();
            this.controller.getTicketList().get(this.getInsertedTicketNumber()).setEndTime(endDate.getTime());
            long timeDiffBegining = this.controller.getTicketList().get(this.getInsertedTicketNumber()).getStartTime();
            long timeDiffEnd = this.controller.getTicketList().get(this.getInsertedTicketNumber()).getEndTime();

            long timeDiffMs = timeDiffBegining - timeDiffEnd;
            long timeDiffs = timeDiffMs / 1000;
            double timeDiffm = timeDiffs / 60;

            double price = timeDiffm * this.controller.getTarif();
            System.out.println("Der zu Zahlende Preis beträgt: " + price + "€");
        }

        else {
            System.out.println("Es wurd kein Ticket eingeführt!");
        }

    }
}
