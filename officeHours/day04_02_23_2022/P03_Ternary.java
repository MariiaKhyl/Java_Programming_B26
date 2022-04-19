package day04_02_23_2022;

import java.util.Scanner;

public class P03_Ternary {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println(a>b?a:b);
        
        
        
        /*
        ? --- if
        : --- else
        
         */
        
        
        /*
            2- Take values of length and width of a rectangle from user and check if it is square or not.
                            ( Scanner Class can be used )
         */

        int x = 8;
        int y = 4;

        if (x == y){
            System.out.println("Square");
        }else{
            System.out.println("Triangle");
        }
        
        String result =x==y?"Square":"Triangle";
        System.out.println("result = " + result);

        System.out.println("==================================================");
        Scanner input = new Scanner (System.in);
        System.out.println("Enter their mass (kilogram) and their height (meters). ");
        double mass = input.nextDouble();
        double height = input.nextDouble();
        double bmi = mass / (height * 2);

        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi >=18.5 && bmi <25){
            System.out.println("Normal weight");
        }else if (bmi >= 25 && bmi < 30){
            System.out.println("Overweight");
        }else  if (bmi >= 30){
            System.out.println("Obese");
        }else {
            System.out.println(" Invalid entry");
        }

        result = (bmi < 18.5)?"Underweight":(bmi >=18.5 && bmi <25)?"Normal weight":(bmi >= 25 && bmi < 30)?"Overweight":"Obese";



    }

}
