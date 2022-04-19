package home_work_day33;

import day33_methods.Age;

public class Task2 {

    /*
    create a method that will accept an age and determine if the person is
eligible to vote. Person must be 18 years or older to vote
     */
    public static void eligibleToVote (int year){

        int age = 2022-year;

        System.out.println("Your age: "+age);
        if (age >= 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }

    public static void main(String[] args) {
        eligibleToVote(1988);
        eligibleToVote(2015);
        eligibleToVote(1999);
        eligibleToVote(1993);

    }


}
