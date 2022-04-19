package day09_Scanner;

public class Discount {

    public static void main(String[] args) {

        /*
        daclare and assign
                is ut the weekend
                are you a teacher
                are you a police officer
                are you a firefighter
        Do you get a discount ?
         Must be a weekend and you must be one of the given profession
         */
        boolean weekend = false;
        boolean teacher = false;
        boolean policeOfficer = true;
        boolean firefighter = false;
        System.out.println(weekend && (teacher || policeOfficer || firefighter));
        boolean getDiscount = weekend && (teacher || policeOfficer || firefighter);
        System.out.println(getDiscount);



    }
}
