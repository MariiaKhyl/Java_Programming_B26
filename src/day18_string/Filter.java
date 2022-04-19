package day18_string;

import java.util.Scanner;

public class Filter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

         /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
     */
        System.out.println("Please enter the message");
        String message = scanner.nextLine();// scanner.nextLine().toLowerCase().trim();
        message = message.toLowerCase();
        message = message.trim();

        /*switch (message){

            case "java is bad":
                System.out.println("message failed to send");
                break;
            case "quit":
                System.out.println("message failed to send");
                break;
            case "have fun":
                System.out.println("message sent");
                break;
            case "crying":
                System.out.println("message failed to send");
                break;
            default:
                System.out.println("Invalid entry");
        }

         */

        if (message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying")){
            System.out.println("Message failed to send");

        }else{
            System.out.println(message+ " was sent");
        }

    }

}
