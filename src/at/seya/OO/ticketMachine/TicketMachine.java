package at.seya.OO.ticketMachine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
        if (this.isInserted()) {
            Date endDate = new Date();
            this.controller.getTicketList().get(this.getInsertedTicketNumber()).setEndTime(endDate.getTime());
            long timeDiffBegining = this.controller.getTicketList().get(this.getInsertedTicketNumber()).getStartTime();
            long timeDiffEnd = this.controller.getTicketList().get(this.getInsertedTicketNumber()).getEndTime();

            long timeDiffMs = timeDiffBegining - timeDiffEnd;
            long timeDiffs = timeDiffMs / 1000;
            double timeDiffm = timeDiffs / 60;

            double price = timeDiffm * this.controller.getTarif();
            System.out.println("Der zu Zahlende Preis beträgt: " + price + "€");
        } else {
            System.out.println("Es wurde kein Ticket eingeführt!");
        }

    }

    public void insertMoney() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scammer = new Scanner(System.in);
         if (this.isInserted()) {
            Date endDate = new Date();
            this.controller.getTicketList().get(this.getInsertedTicketNumber()).setEndTime(endDate.getTime());
            long timeDiffBegining = this.controller.getTicketList().get(this.getInsertedTicketNumber()).getStartTime();
            long timeDiffEnd = this.controller.getTicketList().get(this.getInsertedTicketNumber()).getEndTime();

            long timeDiffMs = timeDiffEnd - timeDiffBegining;
            double timeDiffs = timeDiffMs / 1000;

            double price = timeDiffs * this.controller.getTarif();

            boolean enoughMoney = false;
             System.out.println("Bitte bezahle den Betrag von " + price + "€");

            while(enoughMoney == false) {
                double money = scammer.nextDouble();
                if(money >= price) {
                    double change = money - price;
                    this.exchangeUnit.setChange(change);
                    System.out.println("Es ist ein Wechselgeld von " + change + "€ übriggeblieben!");

                    this.controller.getTicketList().remove(this.insertedTicketNumber);
                    enoughMoney = true;
                }

                else {
                    double tooLessMoney = price - money;
                    System.out.println("Du hast " + tooLessMoney + " zu wenig eingeworfen!");
                    System.out.println("Bitte wirf erneut Geld ein!");
                }

            }
        } else {
            System.out.println("Es wurde kein Ticket eingeführt!");
        }
    }
}
