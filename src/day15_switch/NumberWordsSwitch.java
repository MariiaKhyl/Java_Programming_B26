package day15_switch;

public class NumberWordsSwitch {

    public static void main(String[] args) {

        /*
        Take a number and print the number as the word version
        1 -> one
        2 -> two
         */

        int n = 7;
        // as if statement

        if (n == 1) {
            System.out.println("home_work_day24");
        } else if (n == 2) {
            System.out.println("Two");
        } else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid number");
        }

        // as switch statement

        switch (n) {
            case 1: // in if statement : if (n == 1){
                System.out.println("home_work_day24");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number for Switch");


        }


    }

}
