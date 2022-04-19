package home_work_day11;

public class HoursFormat {
    public static void main(String[] args) {

        /*
        create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23, print: Good night
         */
        int hours = 21;
        if (hours > 6 && hours < 11){
            System.out.println("Good morning");
        }
        if (hours > 12 && hours < 16){
            System.out.println("Good evening");
        }
        if (hours >17 && hours < 23){
            System.out.println("Good night");
        }


    }
}
