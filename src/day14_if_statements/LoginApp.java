package day14_if_statements;

import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {

        /*
        inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    whent he ssn is not correct print:
        invalid ssn
         */


        Scanner input = new Scanner (System.in);


        int expectedPrint = 1552;
        int expectedSSN = 1234;
        System.out.println("Please enter your pin number");
        int pinCode = input.nextInt();
        System.out.println("Please enter the last 4 digits of your SSN number");
        int SSN = input.nextInt();

        if(pinCode == expectedPrint && SSN == expectedSSN){
            System.out.println("Authentication successful" );
        }else{
            if(pinCode != expectedPrint || SSN != expectedSSN)
                System.out.println("Authentication failed");

            if(pinCode != expectedPrint){
                System.out.println("incorrect pin code");
            }
            if (SSN != expectedPrint){
                System.out.println("invalid ssn");
            }

        }

        // Saim
        if(pinCode == expectedPrint && SSN == expectedSSN){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication failed");
            if (pinCode != expectedPrint){
                System.out.println("incorrect pin code");
            }
            if (SSN != expectedSSN){
                System.out.println("invalid ssn");
            }
        }




    }

}
