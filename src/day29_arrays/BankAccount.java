package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        /*
        0 - full name
        1 - account type
        2 - account number
        3 - balance
         */

        String [] bankAccountOne = {"Brad Smith", "Checking", "18850215", "100,000,000"};
        System.out.println(bankAccountOne.length);
        System.out.println(Arrays.toString(bankAccountOne));
        System.out.println("Full name: "+bankAccountOne[0]);
        System.out.println("Account type: "+bankAccountOne[1]);
        System.out.println("Account number: "+bankAccountOne[2]);
        System.out.println("Balance: "+bankAccountOne[3]);



        String [] bankAccountTwo = new String [4];
        bankAccountTwo[0] = "Mariia Khyl";
        bankAccountTwo[1] = "Checking";
        bankAccountTwo[2] = "123456789123456789";
        bankAccountTwo[3] = "1366.45";
        System.out.println(Arrays.toString(bankAccountTwo));


        String [] bankAccountThree = new String [4];
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        bankAccountThree[0] = firstName;
        System.out.println("Enter your account type");
        bankAccountThree[1] = scanner.nextLine();
        System.out.println("Enter your account number");
        bankAccountThree[2] = scanner.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3] = scanner.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));



        // loop
        String [] bankAccountFour = new String [4];
        String [] questions = {"full name","account type","account number","balance"};

        for (int i = 0; i <bankAccountFour.length; i++){

            System.out.println("Enter your "+ questions[i]);
            bankAccountFour[i] = scanner.nextLine();

        }
        System.out.println(Arrays.toString(bankAccountFour));


    }
}
