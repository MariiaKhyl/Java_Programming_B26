package day22_loops;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean keepTalking = true;

        while (keepTalking){
            System.out.println("Enter the message");
            String msg = scanner.nextLine().toLowerCase();

            switch (msg){

                case "hello":
                    System.out.println("Hi");
                    break;
                case "how are you":
                    System.out.println("I an good");
                    break;
                case "bye":
                    System.out.println("No, don't leave");
                    keepTalking = false;
                    break;
                default:
                    System.out.println("I don't know what you said");



            }



        }


    }
}
