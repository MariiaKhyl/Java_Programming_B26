package day03_02_22_2022;

import java.util.Scanner;

public class Weight {

    public static void main(String[] args) {

        /*
        Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Age?");
        int age = input.nextInt();
        System.out.println("Weight?");
        int weight = input.nextInt();

        if(age > 18 && weight > 50){
            System.out.println("You are eligible to donate blood");

        }else {
            if (age >= 18 && weight <= 50){
                System.out.println("You are not eligible to donate blood");
            }else if (age < 18 ){
                System.out.println("Age must be greater than 18");
            }
        }


        if (age >=18){

            if (weight >= 50){
                System.out.println("You are eligible to donate blood");
            }else {
                System.out.println("You are not eligible to donate blood");
            }

        }else {
            System.out.println("Age must be greater than 18");
        }


        String result = (age >=18)? (weight>=50)?"You are eligible to donate blood":"You are not eligible to donate blood":"Age must be greater than 18";






    }


}
