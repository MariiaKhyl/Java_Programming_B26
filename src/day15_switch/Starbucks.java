package day15_switch;

import java.util.Scanner;

public class Starbucks {

    public static void main(String[] args) {

        /*

    Declare price and calories variables

    Ask the user to enter which size drink they want

    Based on the drink size determine the price and calories of the order

        data:

            size: tall
            price: 2.50
            calories: 100

            size: grande
            price: 4.00
            calories: 150

            size: venti
            price: 4.50
            calories: 200

     */

        Scanner input = new Scanner(System.in);
        System.out.println("What size coffee would you like?");
        String size = input.next();
        double price = 0;
        int calories = 0;
        boolean validOrder = true;


        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We don't have it");
                validOrder = false;

        }

        if (validOrder) {
            System.out.println("Your order for a " + size + " coffee is $" + price + " and has " + calories + " calories");
        }







        /*switch (size){

            case 1 :
                System.out.println("size: tall\nprice: 2.50\ncalories: 100");
                break;
            case 2 :
                System.out.println("size: grande\nprice: 4.00\ncalories: 150");
                break;
            case 3:
                System.out.println("size: venti\nprice: 4.50\ncalories: 200");
                break;
            default:
                System.out.println("None");
               }
         */


    }

}
