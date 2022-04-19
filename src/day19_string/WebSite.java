package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class WebSite {

    public static void main(String[] args) {

         /*
        ask the user to enter a url
        find and print the website from the url

        assume your url always starts with www.
        assume your url always ends with .com

        www.google.com
        01234567890123
        --> google
     */



        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the URL");
        String url = scanner.nextLine().toLowerCase();
        //System.out.println(""+url.startsWith("www.") + url.endsWith(".com"));
        //System.out.println(url.substring(4,10));
        //String website = url.substring(4, url.length()-4);
        //System.out.println(website);


        System.out.println(url.substring(4, url.length()-4));

    }

}
