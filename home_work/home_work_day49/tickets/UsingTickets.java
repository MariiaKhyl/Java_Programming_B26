package home_work_day49.tickets;

import home_work_day49.tickets.FlightTicket;

public class UsingTickets {
    public static void main(String[] args) {

        FlightTicket tickets = new FlightTicket("first","Chicago","Ternopil");
        System.out.println(tickets);
        tickets.setArrivalLocation("Lviv");
        tickets.setType("economy");
        tickets.setDepartureLocation("New York");
        System.out.println(tickets);

    }
}
