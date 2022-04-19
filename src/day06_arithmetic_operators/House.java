package day06_arithmetic_operators;

public class House {
    public static void main (String[] args){

        String houseType = "Penthouse";
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isOnSale = true;
        double costOfHouse = 1_000_000.99;
        String address = "129481 Central Park";
        int zipcode = 100011;
        boolean hasPark = true;
        double schoolRating = 4.6;
        String houseInfo = "The " + houseType +" on " + address+", "+zipcode+" cost $"+costOfHouse+ ".\nThe "+houseType+ " has "+numberOfBedrooms+ " bedroomse, "+numberOfBathrooms+ " bathrooms, "+numberOfKitchens+ " kitchen.\nIt also includes a basement: "+ hasBasement+ ";\nHas an attic: "+hasAttic+".\nHas a pool: "+hasPool + " and is on a sale: "+isOnSale+", and has a park - " +hasPark+ ". The school in the area have a rating of "+schoolRating+". ";

        System.out.println("My house details:");
        System.out.println(houseInfo);


    }
}
