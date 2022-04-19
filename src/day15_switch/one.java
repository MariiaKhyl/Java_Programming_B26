package day15_switch;

import java.util.Scanner;

public class one {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Select screen size:");
            String screenSize = scan.nextLine();

            System.out.println("Select CPU type:");
            String cpu = scan.nextLine();
            System.out.println("Select RAM size:");
            int ramSize = scan.nextInt();
            System.out.println("Select storage type:");
            String storageType = scan.nextLine();
            scan.nextLine();
            System.out.println("Select storage size:");
            int storageSize = scan.nextInt();
            System.out.println("Select screen resolution:");
            String resolution = scan.nextLine();

            double price=0;

            switch (screenSize){
                case "13.3":
                    price += 200;
                    break;
                case"15.0":
                    price += 300;
                    break;
                case "17.3":
                    price += 400;
                    break;
            }

            switch (cpu){
                case "i3":
                    price += 150;
                    break;
                case "i5":
                    price += 250;
                    break;
                case "i7":
                    price += 350;
                    break;
            }

            price += 50 * (ramSize/4);

            switch (storageType){
                case "HDD":
                    price += 50 * (storageSize / 500);
                    break;
                case "SSD":
                    price += 100 * (storageSize / 500);
                    break;
            }
            switch (resolution) {
                case "FULLHD":
                    price += 100;
                    break;
                case "4K":
                    price += 200;
                    break;
            }
            System.out.println ("Final price is: $" + price);



            boolean x = true, z = true;
            int y=20;
            x= (y!=10) || (z = false);
            System.out.println(x);


















        }
    }

