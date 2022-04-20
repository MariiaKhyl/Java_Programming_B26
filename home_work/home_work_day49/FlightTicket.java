package home_work_day49;

public class FlightTicket {

    /*
    FlightTicket
            instance variables:
                type (first, business, economy)
                departure location
                arrival location

            constructor: initialize all fields
                -> only allow the given ticket types to be set

            encapsulate all the fields
     */

    private String type, departureLocation, arrivalLocation;

    public FlightTicket(String type, String departureLocation, String arrivalLocation){
        setType(type);
        setDepartureLocation(departureLocation);
        setArrivalLocation(arrivalLocation);
    }
    public void setType(String type){

        if(type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")){
            this.type = type;
        }
    }
    public String getType(){
        return type;
    }
    public void setDepartureLocation(String departureLocation){
        this.departureLocation = departureLocation;
    }
    public String getDepartureLocation(){
        return departureLocation;
    }
    public void setArrivalLocation(String arrivalLocation){
        this.arrivalLocation = arrivalLocation;
    }
    public String getArrivalLocation(){
        return arrivalLocation;
    }
    public String toString(){
        return "Type: "+type+", departure: "+departureLocation+", arrival: "+arrivalLocation;

    }







}
