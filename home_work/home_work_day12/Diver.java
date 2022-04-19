package home_work_day12;

public class Diver {
    public static void main(String[] args) {

        /*
                Create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at 50%

         */
        int level = 60;
        System.out.println("Checking the tank level");
        if(level >= 90){
            System.out.println("Your tank is full. Above 90");
        }else if(level >= 80){
            System.out.println("Still okay. Above 80");
        }else if(level >= 70){
            System.out.println("Don't go too far. Above 70");
        }else if (level >= 60){
            System.out.println("Start to head back. Above 60");
        }else if(level >= 50){
            System.out.println("Be careful now you at 50%. Above 50");
        }else{
            System.out.println("You are in danger. Less then 50.");
        }

    }
}
