package home_work_day12;

import java.util.Scanner;

public class GoalsAndErrors {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);
        int goals = input.nextInt();
        int errors = input.nextInt();

        //int goals = 22;
        //int errors = 12;
        if (goals >10 && errors == 0){
            System.out.println("WOW");
        }else {
            System.out.println("Oh well ");
        }


    }
}
