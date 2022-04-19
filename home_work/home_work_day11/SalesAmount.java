package home_work_day11;

import java.util.Scanner;

public class SalesAmount {

    public static void main(String[] args) {

        /*
        create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
         */

        Scanner input = new Scanner (System.in);
        double bonus = input.nextDouble();

        if(bonus <= 10000){
            System.out.println("Your sales amount less than 10000 ");
        }else if (bonus >= 10000 && bonus < 15000){
            System.out.println("Your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000");
        }else if (bonus >=15000){
            System.out.println("Your sales amount is more than or equal to 15000 you get a bonus of 7000");
        }




    }
}
