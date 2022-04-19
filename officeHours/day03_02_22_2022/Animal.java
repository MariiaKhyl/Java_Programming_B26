package day03_02_22_2022;

import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("animal?");
        String animal = input.next();

        switch ( animal){

            case " Dog":
            case "dog":
            case "DOG":

                break;

            case "Cat":
            case "cat":
            case "CAT":
                break;

            case "Tiger":
            case"tiger":
            case"TIGER":
                break;
            default:
                System.out.println("unknown animal");
        }
        System.out.println(animal + " domestic animal");

    }


}
