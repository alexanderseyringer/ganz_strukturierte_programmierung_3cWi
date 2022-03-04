package at.seya.OO.ticketMachine;

public class Main {
    public static void main(String[] args) {
        Controller compusafe = new Controller(0.01);

        ExchangeUnit superChanger100 = new ExchangeUnit();

        TicketMachine ticketer500 = new TicketMachine(compusafe, superChanger100);

        ticketer500.getTicket();

        ticketer500.insertTicket(0);
        ticketer500.getPrice();
    }
}
