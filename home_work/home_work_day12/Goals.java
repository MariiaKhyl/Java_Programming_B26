package home_work_day12;

import java.util.Scanner;

public class Goals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int goals = input.nextInt();

        if (goals >= 10){
            System.out.println("Wow");
        } else{
            System.out.println("Oh well");
        }


    }

}
