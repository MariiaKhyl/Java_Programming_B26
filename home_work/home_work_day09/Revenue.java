package home_work_day09;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.

         */


        /*System.out.println("Please enter the price");
        double pleaseEnterThePrice = input.nextDouble();
        System.out.println("Please enter the quantity");
        double pleaseEnterQuantity = input.nextDouble();
        System.out.println("What is the revenue? ");
        double revenue = pleaseEnterThePrice * pleaseEnterQuantity;
        System.out.println(revenue);
        String answer = "Please enter the price - "+ pleaseEnterThePrice+ " Please enter the quantity - "+pleaseEnterQuantity+" What is the revenue? "+ revenue;
        System.out.println(answer);

         */

          //class task
        System.out.println("Enter the price of the item");
        double price = scanner.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scanner.nextInt();

        double revenue = price * quantity; // or sout("The revenue is $"+ (scanner.nextDouble() * scanner.nextInt()));
        System.out.println("The revenue ia: $"+revenue);



    }
}
