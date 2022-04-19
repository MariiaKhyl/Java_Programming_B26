package day15_switch;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your browser");
        String browser = input.nextLine();
        System.out.println("Please enter your URL");
        String url = input.nextLine();

        switch (browser){
            case "chrome":
            case "Chrome":
                System.out.println("Opening "+url+ " in Chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
            case "safari":
                System.out.println("Opening "+url+" in Safari");
                System.out.println("Loading...");
                break;
            case "Firefox":
            case "firefox":
                System.out.println("Opening "+url+" in Firefox");
                System.out.println("Loading...");
                break;
            default:
                System.out.println(browser+ " is not a valid browser");





        }



    }

}
