package home_work_day08;

public class Speeding {
    public static void main(String[] args) {

        /*create a class called Speeding, and write a program to determine if the car is speeding

        declare 3 variables:
        current speed, speed limit, speeding boolean

                print
        "Are you speeding? " true/false

         */
        int currentSpeed = 180;
        int speedLimit = 55;
        boolean speedingBoolean = currentSpeed > speedLimit;
        System.out.println(" Are you speeding? " + speedingBoolean);

    }
}
