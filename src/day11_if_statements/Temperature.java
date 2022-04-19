package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {



    /*
    ask the user to enter the temperature

    if the temperature is above or equal to 70
        it's a nice day
        Go outside, but with your laptop to code Java
    if the temperature if less than 70
        Code more Java
     */
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the temperature ");
        int temp = input.nextInt();
 //     int temp = 100;  hard coded version
        if(temp >= 70){
            System.out.println("It's a nice day!\nGo outside, but with your laptop to code Java");
        }else{
            System.out.println("Code more Java");
        }


    }
}
