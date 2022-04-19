package home_work_day09;

import java.util.Scanner;

public class AngleNumbers {
    public static void main(String[] args) {



        /*
        Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0

---------------------------------------------------------------------------
         */
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Please enter three angle numbers. ");
        float firstNumber = input.nextFloat();
        float secondNumber = input.nextFloat();
        float thirdNumber = input.nextFloat();
        System.out.println("Are the angles make a triangle? " + (firstNumber+secondNumber+thirdNumber == 180.0));
        System.out.println("Are the angles make a circle? " + (firstNumber+secondNumber+thirdNumber == 360.0));


         */
        System.out.println("Enter 3 angle numbers");
        double angleOne = scanner.nextDouble();
        double angleTwo = scanner.nextDouble();
        double angleThree = scanner.nextDouble();
        boolean isTriangle = angleOne + angleTwo + angleThree == 180.0;
        boolean isCircle = angleOne +angleTwo + angleThree == 360.0;
        System.out.println("Is a triangle :" + isTriangle);
        System.out.println("Is a circle :" + isCircle);




    }
}
