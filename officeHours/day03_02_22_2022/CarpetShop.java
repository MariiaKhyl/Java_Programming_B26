package day03_02_22_2022;

import java.util.Scanner;

public class CarpetShop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("which room do they need carpet?");
        String roomType = input.nextLine();
        System.out.println("What is the delivery address? ");
        String address = input.nextLine();


        switch (roomType) {

            case "bedroom":
                System.out.println("Please enter the dims");
                double dims = input.nextDouble();
                System.out.println("Is it square or rectangle?");
                String squareOrRectangle = input.nextLine();
                input.nextLine();
                if (squareOrRectangle == "square") {
                    System.out.println("Square");
                } else if (squareOrRectangle == "rectangle") {
                    System.out.println("Rectangle");
                }
                System.out.println("What is the length");
                double length = input.nextDouble();
                System.out.println("What is the width");
                double width = input.nextDouble();
                double area = length * width;
                double unitPriceCarpet = 3.92;
                double totalCost = area * unitPriceCarpet;
                System.out.println("Total cost for your carpet is " + totalCost + " and it will be delivery " + address + " on one week");
                break;

            case "kitchen":
                System.out.println("Radius?");
                double circle = input.nextDouble();
                double unitPriceCarpet1 = 3.92;
                double totalCost1 = circle * unitPriceCarpet1;
                System.out.println("Total cost for your carpet is " + totalCost1 + " and it will be delivery " + address + " on one week");
                break;
            default:
                System.out.println("Invalid");
        }

    }

}






