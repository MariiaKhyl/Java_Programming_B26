package day18_string;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        /*
        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check i the password is more than 8 characters long

        valid system password : "jamesbond"
        -> if the entered password is matches the system password

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name");
        String username = scanner.next();
        username.toLowerCase();
        username = username.toLowerCase();

        System.out.println("Please enter your password");
        String password = scanner.next();

        if (password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("Logged in with "+ username);
        }else{
            System.out.println("Invalid entry");
        }

        System.out.println(username);









    }
}
