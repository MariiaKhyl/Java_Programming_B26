package home_work_day12;

public class Retake {
    public static void main(String[] args) {

        /*
        create a class Retake

declare and assign a grade variable
declare and assign an attempt number

Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

	If its the first attempt -> subtract 10%
	If its the second attempt -> subtract 20%
	If its the third attempt -> subtract 35%

Based on the retake attempt number calculate the final grade
         */
        double gradeVariable = 1000;
        double attemptNumber = 3;

        if (attemptNumber == 1){
            System.out.println("We got: attempt -> subtract 10% " + (gradeVariable - attemptNumber)/ 0.10);
        }else if (attemptNumber == 2){
            System.out.println("We got: attempt -> subtract 20% " + (gradeVariable - attemptNumber)/ 0.20);
        }else if (attemptNumber == 3){
            System.out.println("We got: attempt -> subtract 35% "+ (gradeVariable - attemptNumber)/ 0.35);
        }else {
            System.out.println("Incorrect value");
        }




    }

}
