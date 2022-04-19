package day42_custom_classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {

        App cydeo = new App();

        cydeo.name = "Cydeo";
        cydeo.version = 5.5;
        cydeo.isFree = true;

        System.out.println();
        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo);

        new App().run(); // this creates an object with no reference and calls the run method

        System.out.println(new Scanner(System.in).nextLine());


    }
}
