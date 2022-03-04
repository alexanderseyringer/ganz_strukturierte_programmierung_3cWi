package at.seya.OO.ticketMachine;

public class Main {
    public static void main(String[] args) {
        Controller compusafe = new Controller(0.01);

        TicketMachine ticketer500 = new TicketMachine(compusafe);

        ExchangeUnit superChanger100 = new ExchangeUnit(ticketer500, compusafe);

        ticketer500.getTicket();

        ticketer500.insertTicket(0);
        superChanger100.getPrice();
    }
}
