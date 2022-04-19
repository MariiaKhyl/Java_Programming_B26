package day14_if_statements;

import java.util.Scanner;

public class RealEstate {

    public static void main(String[] args) {

        /*
        We are buying a house
        ask the user for their budget (single number, max)

        Find the area that the user's budget fits into and provide all the info of the neighborhood

        extra condition: if the user gives a budget value below 0, it is invalid , so print : "That is not a valid budget"

        Data based on neighborhood name:
            name - Hills
            average price - 80,000 - 100,000
            rating - 4.0
            gated - no
            allow pets - yes

            name - Oaks
            average price - 55,000 - 90,000
            rating - 3.5
            gated - no
            allow pets - yes

            name - Highland
            average price - 120,000 - 150,000
            rating - 4.5
            gated - yes
            allow pets - no

            name - Canyon
            average price - 160,000 -201,000
            rating - 4.8
            gated - yes
            allow pets - yes

            If the budget is no in any range print: "No available houses"

         */

        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter your min budget");
        double budgetSingle = input.nextDouble();
        System.out.println("Please enter your max budget");
        double budgetMax = input.nextDouble();

        if (budgetMax > 0 && budgetMax < 300_000) {

            if (budgetSingle >= 80000 && budgetMax <= 100000) {
                System.out.println("name - Hills\naverage price - 80,000 - 100,000\nrating - 4.0\ngated - no\nallow pets - yes");
            } else if (budgetSingle >= 55000 && budgetMax <= 90000) {
                System.out.println("name - Oaks\naverage price - 55,000 - 90,000\nrating - 3.5\ngated - no\nallow pets - yes");
            } else if (budgetSingle >= 120000 && budgetMax <= 150000) {
                System.out.println("name - Highland\naverage price - 120,000 - 150,000\nrating - 4.5\ngated - yes\nallow pets - no");
            } else if (budgetSingle >= 160000 && budgetMax <= 201000) {
                System.out.println("name - Canyon\naverage price - 160,000 -201,000\nrating - 4.8\ngated - yes\nallow pets - yes");
            } else {
                System.out.println("No available houses");
            }
        } else {
            if (budgetSingle <= 0 && budgetMax <= 0) {
                System.out.println("That is not a valid budget");
            }
        }

         */


        // Saim
        Scanner input = new Scanner(System.in);
        System.out.println("What is your max budget?");
        int budget = input.nextInt();

        String name = "", range = "";
        double rating = 0;
        boolean gated = false, allowPets = false, isAvailable = true;

        if (budget > 0 && budget < 300_000) {

            System.out.println("Looking for houses");

            if (budget >= 55_000 && budget <= 75_000) {
                name = "Oaks";
                range = "55,000 - 75,000";
                rating = 3.5;
                gated = false;
                allowPets = true;
            } else if (budget >= 80_000 && budget <= 100_000) {
                name = "Hills";
                range = "80,000 - 100,000";
                rating = 4.0;
                gated = false;
                allowPets = true;
            } else if (budget >= 120_000 && budget <= 150_000) {
                name = "Highland";
                range = "120,000 - 150,000";
                rating = 4.5;
                gated = true;
                allowPets = false;
            } else if (budget >= 160_000 && budget <= 201_000) {
                name = "Canyon";
                range = "160,000 - 201,000";
                rating = 4.8;
                gated = true;
                allowPets = true;
            } else {
                System.out.println("No available houses");
                isAvailable = false;
            }

            if (isAvailable) {

                String ad = "Name of the neighborhood: " + name + "\nPrice range: " + range + "\nRating: " + rating;
                ad += "\nGated: " + (gated ? "Yes" : "No"); // this means if the gated boolean is true, it will concatenate "yes" into the ad, but if the gated boolean is false it will concatenate "no" into the ad
                ad += (allowPets ? "They allow pets" : "They don't allow pets");

                System.out.println(ad);
            }

        } else {

            if (budget <= 0) {
                System.out.println("Your budget cannot be less than or equal to 0");
            } else {
                System.out.println("Too much money for this agency");
            }

        }


    }
}
