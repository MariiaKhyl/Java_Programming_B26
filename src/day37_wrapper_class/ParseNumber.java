package day37_wrapper_class;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {

        String year = "2022";
        System.out.println("This year "+year);
        System.out.println("Next year will be "+(year+1));

        int numYear = Integer.parseInt(year);
        System.out.println("This year "+numYear);
        System.out.println("Next year will be "+(numYear+1));


        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your message: I am x years old");
        String str= scanner.nextLine(); //I am x years old
        // in 5 years you will be $ageIn5Years

       //String arr = str.split(" ");
      // String agePart = arr[2];

        String agePart = str.split(" ")[2];
        int age = Integer.parseInt(agePart);
        System.out.println("In 5 years, you will be "+(age + 5));



    }
}
