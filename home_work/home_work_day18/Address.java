package home_work_day18;

import java.util.Locale;
import java.util.Scanner;

public class Address {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your address");
        String address = scanner.nextLine();
        address = address.trim().toUpperCase();
        System.out.println(address);

        if (address.startsWith("500")){
            System.out.println("house on the right side");
        }
        if (address.startsWith("600")){
            System.out.println("house on the left side");
        }

        if (address.contains("DRIVE")){
            System.out.println("house on drive");
        }else if (address.contains("LANE")){
            System.out.println("house on lane");
        }else if (address.contains("AVE")){
            System.out.println("house on avenue");
        }





    }
}
