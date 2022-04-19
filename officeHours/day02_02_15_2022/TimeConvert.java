package day02_02_15_2022;

public class TimeConvert {

    public static void main(String[] args) {

        /*
        2.Create class named "TimeConverter" and make a main method

						- Write a Java program to convert time from second to hours/min/sec format
						- Input Seconds : 3695


							Expected Output:
							inputSeconds is 3695
							1 hours 1 minutes 35 seconds

        how many sec we have?
        660 sec = 1 min
        60 min = 1 hour
        60*60 = 3600 in hour
         */

        int inputSeconds = 3695;

        int hours,minutes,seconds;

        hours = inputSeconds / 3600; // hours = 1;

        minutes = inputSeconds % 3600 / 60;

        seconds = inputSeconds % 60;
        System.out.println(hours +" hours "+minutes+ " minutes "+seconds+" seconds");


        // day/hours/min/sec


            int s = 5000;
            int h = s/ 3600;
            int m = s %3600/ 60;
            int s2 = s % 3600 % 60;
        System.out.println(h+ " Hours "+ m + " Minutes " + s2 + "Seconds");


    }

}
