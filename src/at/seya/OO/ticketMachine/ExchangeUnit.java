package at.seya.OO.ticketMachine;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ExchangeUnit {
    private double change;
    private TicketMachine ticketMachine;
    private Controller controller;

    public ExchangeUnit() {
        this.change = change;
        this.ticketMachine = ticketMachine;
        this.controller = controller;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }
}

