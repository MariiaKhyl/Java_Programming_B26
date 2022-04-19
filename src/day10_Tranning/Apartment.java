package day10_Tranning;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {

        /*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your address? ");
        String address = input.nextLine();
        address = "My address is" + address;

        System.out.println("What is your name ?");
        String ownerName = input.nextLine();
        ownerName = "My name is " + ownerName;

        System.out.println("How many units? ");
        int units = input.nextInt();
        System.out.println("I have "+ units + " units");

        System.out.println("What is the average size of each unit? ");
        double sizeOfEachUnits = input.nextDouble();
        String size = "Average size of each unit " + sizeOfEachUnits;
        System.out.println(size);

        System.out.println("What is monthly rent amount?");
        double monthlyRentAmount = input.nextDouble();
        String rentAmount = "What is monthly rent amount? "+ monthlyRentAmount;
        System.out.println(rentAmount);

        System.out.println("What is the number of washer and drier?");
        int washerAndDrier = input.nextInt();
        String numberOfWasherAndDrier = "I have "+washerAndDrier+ " washer and drier";
        System.out.println(numberOfWasherAndDrier);

        System.out.println("Is there allows pets or not");
        boolean allowsPetsOrNot = input.nextBoolean();
        System.out.println("Allows pets or not "+ allowsPetsOrNot);

        System.out.println("Has a pool?");
        boolean hasPool = input.nextBoolean();

        System.out.println("What is length of lease? $");
        double leaseLength = input.nextDouble();
        String lease = "Length of lease " + leaseLength;
        System.out.println(lease);

        System.out.println("What is the total number of residents in building ");
        int totalNumberOfResidents = input.nextInt();
        System.out.println("The total number of residents in building " + totalNumberOfResidents);

        input.nextLine();

        System.out.println("What is the phone number of owner?");
        String phoneNumber = input.nextLine();
        System.out.println("The phone number of owner is "+ phoneNumber);

        System.out.println("Is near a gas station?");
        boolean gasStation = input.nextBoolean();
        String gas = "Yes, there is a gas station near " + gasStation;
        System.out.println(gas);

        System.out.println("What is the number of floors?");
        int floorNumbers = input.nextInt();
        System.out.println("In the house " + floorNumbers + " floors. ");

        System.out.println("Has a basement? ");
        boolean basement = input.nextBoolean();
        System.out.println("has a basement " + basement);

        System.out.println("Has available units for rent? ");
        boolean availableUnits = input.nextBoolean();
        System.out.println("No, there is no available units for rent " + availableUnits);

        System.out.println("Has air conditioning?");
        boolean hasAirConditioning = input.nextBoolean();
        System.out.println("Yes, has air conditioning " + hasAirConditioning);

        System.out.println("How many parking spaces? ");
        int parkingSpaces = input.nextInt();
        System.out.println("Number of parking spaces "+ parkingSpaces);

        System.out.println("Has wheel chair access? ");
        boolean wheelChair = input.nextBoolean();
        System.out.println("No wheel chair access " + wheelChair);

        System.out.println("Number of review stars (out of 5)");
        double numberOfStars = input.nextDouble();
        System.out.println("Number of review stars - "+ numberOfStars);

        double monthlyRentAfter3Years = monthlyRentAmount * 0.9; //monthlyRentAfter3Years = monthlyRentAmount - (monthlyRentAmount * 0.1)
        System.out.println("Monthly rent after 3 years is " + monthlyRentAfter3Years);
        double monthlyRentAfter6Years = monthlyRentAmount * 0.8;
        System.out.println("Monthly rent after 6 years is " + monthlyRentAfter6Years);

        int averageNumberOfResidentsPerUnit= totalNumberOfResidents / units;
        System.out.println("Average number of residents per unit is " + averageNumberOfResidentsPerUnit);

        int averageNumberOfParkingSpotsPerUnit = parkingSpaces / units;
        System.out.println("Average number of parking spots per unit is " + averageNumberOfParkingSpotsPerUnit);

        int averageNumberOfUnitsPerFloor =  units / floorNumbers;
        System.out.println("Average number of units per floor is " + averageNumberOfUnitsPerFloor);






    }


    }



