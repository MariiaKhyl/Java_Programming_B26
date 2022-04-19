package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        /*
        Task: Hard code -> Dynamic

        Create a double value for the account balance.
    Create a double value for how much you want to withdraw

    Check the balance after the withdraw
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over
         */

        Scanner input = new Scanner (System.in);
        System.out.println("What is your balance");
        double balance = input.nextDouble();
        System.out.println("How much are you withdrawing");
        double withdraw = input.nextDouble();



        /*  hard code version
        double accountBalance = 100;
        double withdraw = 300;
        double balance = accountBalance - withdraw; // accountBalance -= withdraw;
         */
        System.out.println("The balance after the withdraw "+ balance);

        if (balance < 0) {
            System.out.println("I spend too much " + balance);
            balance -= 100;
        }
            /*
        }else{
            System.out.println("I didn't spend too much " + balance);
        }

             */













    }
}
