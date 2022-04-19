package replit;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();



        int originalLength = str.length();


        int firstIndex = str.indexOf("bread");
        str = str.substring(firstIndex + 5);
        if(!str.contains("bread")){
            System.out.println("nothing");
        }else {
            int secondIndex = str.lastIndexOf("bread");
            str = str.substring(0, secondIndex);
            int finalLength = str.length();
            System.out.println(str);
        }


    }


}
