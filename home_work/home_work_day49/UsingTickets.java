package home_work_day49;

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
