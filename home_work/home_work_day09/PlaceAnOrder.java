package home_work_day09;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        /*

- Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the product name");
        String productName = input.nextLine();
        System.out.println("Please enter the price");
        double price = input.nextDouble();
        System.out.println("Please enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        String info = fullName+ ", your order for "+ quantity+" "+productName+ " has been placed. Your total is $"+ (price * quantity);
        System.out.println(info);

    }

}
