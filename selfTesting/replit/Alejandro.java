package replit;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        /*switch (email){

            case "alejandro":
            case "Alejandro":
                System.out.println("read");
                break;
            case "Project":
            case "project":
                System.out.println("priority");
                break;
            default:
                System.out.println("don't read");
        }

         */


        if (email.contains("Alejandro")&& !email.contains("project")){
            System.out.println("read");
        }else if (email.contains("project")){
            System.out.println("priority");
        }else{
            System.out.println("don't read");
        }



    }
}
