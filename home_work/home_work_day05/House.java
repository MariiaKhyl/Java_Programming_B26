package home_work_day05;

public class House {
    public static void main(String[] args) {

        String houseType, address;
        int numberOfBedrooms, numberOfBathrooms, numberOfKitchens, costOfTheHouse, zipCode;
        boolean isThereIsBasement = true;
        boolean isThereIsAttic = false;
        boolean isThereIsPool = false;
        boolean isTheHouseForSale = true;
        boolean isTheParkNear = true;
        char ratingOfSchool = '5';

        houseType = "single house";
        address = "1513 Hoffman ave. Park Ridge, IL ";
        numberOfBedrooms = 3;
        numberOfBathrooms = 2;
        numberOfKitchens = 1;
        costOfTheHouse = 361_000;
        zipCode = 60068;

        System.out.println("We bought the "+houseType+" last year. There is a "+numberOfBedrooms+" badroomse in the house. Also, "+numberOfBathrooms+" bathroom  and "+numberOfKitchens+ " kitchen.\nHouse with the basement. It's "+isThereIsBasement+". \nHouse also has a attic - "+isThereIsAttic+", and without the pool - "+isThereIsPool+".\nAnd right now we are trying to sell it "+isTheHouseForSale+".\nCost of the house "+costOfTheHouse+".\nAddress - "+address+" "+zipCode+"\nPark is very close to the house "+isTheParkNear+ ". School rating is very good - "+ratingOfSchool);



    }
}
