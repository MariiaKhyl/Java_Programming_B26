package day03_02_22_2022;

import java.util.Scanner;

public class P01_02_23_BMI {

    public static void main(String[] args) {

        /*
        BMI (Body Mass Index): Program will ask user to enter their mass (kilogram) and their height (meters).
							Calculate their BMI and then print the appropriate message based on the provided values:
								All numbers taken as doubles

								—> BMI Formula: BMI = mass / height^2
								—> Values:

									Less than 18.5 — Underweight
									From 18.5 to 25 — Normal weight
									From 25 to 30 — Overweight
									More than or equal to 30 — Obese

								 	Output :  Underweigth    or    Normal weight    or   etc.

         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter their mass (kilogram) and their height (meters). ");
        double mass = input.nextDouble();
        double height = input.nextDouble();
        double bmi = mass / (height * 2);

        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi > 18.5 && bmi <25){
            System.out.println("Normal weight");
        }else if (bmi >= 25 && bmi < 30){
            System.out.println("Overweight");
        }else  if (bmi >= 30){
            System.out.println("Obese");
        }else {
            System.out.println(" Invalid entry");
        }


    }

}
