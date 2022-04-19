package day12_if_statements;

public class WorkingHours {

    public static void main(String[] args) {

        /*
        create a double variable for your hourly rate
create a double variable for the number of hours worked

calculate your net pay, with consideration of overtime pay

	if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
		(if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
         */

        double hourlyRate = 20.5;
        double numberOfHours = 44;
        double netPay;
        String message;
        if (numberOfHours > 40){

            // when the number of hours is more than 40 , we will get an extra 1.5 for overtime pay
            double overTimeHours = numberOfHours - 40;
            netPay = 40 * hourlyRate;
            netPay += overTimeHours* hourlyRate * 1.5;
            message = "You worked "+numberOfHours+" hours at a rate of "+ hourlyRate+ ", but "+overTimeHours+" of the hours were overtime, so you got an additional pay for those hours";
        }else {
            // when the number of hours is less than or equal to 40, we will run this code
           netPay = numberOfHours * hourlyRate;
           message = "You worked "+numberOfHours+" hours at a rate of "+ hourlyRate+ " there was no overtime.";
        }
        System.out.println("Total net pay is: "+ netPay);
        System.out.println(message  );
    }


}
