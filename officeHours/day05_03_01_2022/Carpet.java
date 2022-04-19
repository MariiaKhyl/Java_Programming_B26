package day05_03_01_2022;

import java.util.Locale;
import java.util.Scanner;

public class Carpet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please type one of them.\n\tList of Rooms\n\t\tBedroom\n\t\tKitchen");
        String roomType = scanner.nextLine().toLowerCase();
        boolean isValid = roomType.equals("bedroom")|| roomType.equals("kitchen");
        double area = 0;
        double unitPrice = 3.92;

        if (isValid){
            System.out.println("Calculating...");

            switch (roomType){
                case "bedroom":
                    System.out.println("Please enter your "+roomType+" dimensions");
                    double width = scanner.nextDouble();
                    double length = scanner.nextDouble();
                    area = width*length;
                    break;
                case "kitchen":
                    System.out.println("Please enter your "+roomType+" dimensions");
                    double radius = scanner.nextDouble();
                    area = 0;
                    break;

            }
            double totalCost = unitPrice*area;

            System.out.println("Please enter your address");
            String address = scanner.nextLine();

            System.out.println("Total cost for your carpet is " + totalCost + " and it will be delivery " + address + " on one week");


        }else{
            System.out.println("Invalid Room Type");
        }











    }



}
