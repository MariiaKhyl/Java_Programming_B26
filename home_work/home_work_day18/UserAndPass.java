package home_work_day18;

import java.util.Scanner;

public class UserAndPass {

    public static void main(String[] args) {

            /*
            ask the user to enter a username and password. Check if they are valid based on the following requirements:

- The password cannot be less than 5 characters
	If it is less print: "Password cannot be less than 5 characters"
	If it is more than or equal to 5 print: "Valid password"

- Also, the password should not contain the username
	If the password has the username in it print: "Invalid password, username should not be in it" and in that case change the password to have the value: "password"

Print the information in the end
             */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = scanner.next();
        System.out.println("Please enter your password");
        String password = scanner.next();

        if (password.length() >= 5 && !password.equals(username)){
            System.out.println("Valid password");
        }else{
            System.out.println("Password cannot be less than 5 characters");
        }

    }
}
