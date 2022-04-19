package day18_string;

import java.util.Scanner;

public class Website {

    public static void main(String[] args) {

        /*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net

     */


        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the URL");
        String webSite = scanner.next();

        boolean validStart = webSite.startsWith("www.");
        boolean validEnd = webSite.endsWith(".com") || webSite.endsWith(".edu") || webSite.endsWith(".gov") || webSite.endsWith(".new");

        if (validStart && validEnd){
            System.out.println(webSite + " is a valid website");
        }else{
            System.out.println("Invalid entry");
        }


        if (validStart && validEnd){
            System.out.println(webSite + "is a valid website");
        }else{
            if (!validStart){
                System.out.println("URL needs to start with www.");
            }
            if(!validEnd){
                System.out.println("Url needs to end with .com , .edu, .gov, .net");
            }
        }






    }

}
