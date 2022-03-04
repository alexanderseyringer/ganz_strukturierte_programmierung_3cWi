package at.seya.OO.ticketMachine;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ExchangeUnit {
    private double change;
    private TicketMachine ticketMachine;
    private Controller controller;

    public ExchangeUnit(TicketMachine ticketMachine, Controller controller) {
        this.change = change;
        this.ticketMachine = ticketMachine;
        this.controller = controller;
    }

    public void getPrice() {
        if(this.ticketMachine.isInserted()) {
            Date endDate = new Date();
            this.controller.getTicketList().get(this.ticketMachine.getInsertedTicketNumber()).setEndTime(endDate.getTime());
            long timeDiffBegining = this.controller.getTicketList().get(this.ticketMachine.getInsertedTicketNumber()).getStartTime();
            long timeDiffEnd = this.controller.getTicketList().get(this.ticketMachine.getInsertedTicketNumber()).getEndTime();

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
