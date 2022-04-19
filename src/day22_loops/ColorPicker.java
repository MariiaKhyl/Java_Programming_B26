package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        /*
        you are working on some art piece
        this program will help you pick some colors

        flow : ask for a color
               get 3 unique colors by the end
         */
        Scanner scanner = new Scanner (System.in);
        int colorsPicked = 0;
        String uniqueColor = "";


        while (colorsPicked< 3){
            System.out.println("Pick a color");
            String color = scanner.nextLine().toLowerCase();
            System.out.println(color);
            colorsPicked++;
            uniqueColor+= color;


        }


    }
}
