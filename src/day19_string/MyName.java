package day19_string;

import java.util.Scanner;

public class MyName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your name");
        String name = scanner.next().toLowerCase();
        System.out.println(""+name.charAt(0)+name.charAt(1)+name.charAt(2)+name.charAt(3)+name.charAt(4)+name.charAt(name.length() - 1));

        /*
        String name = "Mariia Khyl";

        //             012345678910
        System.out.println(name.substring(10));
*/




    }

}
