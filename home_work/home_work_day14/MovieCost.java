package home_work_day14;

import java.util.Scanner;

public class MovieCost {

    public static void main(String[] args) {

        /*
        The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99

         */
        Scanner input = new Scanner (System.in);
        double length = input.nextDouble();

        if(length <= 0 || length > 4){
            if (length <= 0){
                System.out.println("Movies cannot be less than 0 minutes");
            }else if(length > 4){
                System.out.println("Movies cannot be more than 4 hours");
            }

        }else{
            if (length == 1.0) {
                System.out.println("Length "+length+"\t\t $8.99");
            }else if (length == 1.5){
                System.out.println("Length "+length+"\t\t $10.50");
            }else if (length == 2.0){
                System.out.println("Length "+length+"\t\t $12.99");
            }else if(length == 2.5){
                System.out.println("Length "+length+"\t\t $14.50");
            }else if (length >= 3 || length <= 4){
                System.out.println("Length "+length+"\t $15.99");
            }


        }





    }

}
