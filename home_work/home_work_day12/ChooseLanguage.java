package home_work_day12;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        /*
        create a class ChooseLanguage

ask the user to enter a number based on the language they wanted to use.
	1 - English
	2 - Spanish
	3 - Turkish
	4 - Ukrainian
	5 - French

based on the number they picked print a message:

	1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number based on the language you wanted to use.");
        int languageNumber = input.nextInt();

        if (languageNumber == 1){
            System.out.println("1 - English");
        }else if(languageNumber == 2){
            System.out.println("2 - Spanish");
        }else if(languageNumber == 3){
            System.out.println("3 - Turkish");
        }else if(languageNumber == 4){
            System.out.println("4 - Ukrainian");
        }else if (languageNumber == 5){
            System.out.println("5 - French");
        }else{
            System.out.println("Invalid entry. Please try again");
        }
        if (languageNumber == 1){
            System.out.println("Hello, thank for your call");
        }else if (languageNumber == 2){
            System.out.println("Hola, gracias para llamar");
        }else if (languageNumber == 3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if(languageNumber == 4){
            System.out.println("Pryvit, diakuiy za dzvinok");
        }else if (languageNumber == 5){
            System.out.println("Merci ,pour votre appel");
        }else{
            System.out.println("We will use English by default");
        }

    }
}
