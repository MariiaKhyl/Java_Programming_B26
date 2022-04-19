package home_work_day38;

import java.util.ArrayList;
import java.util.Scanner;

public class CharactersOne {
    /*
    Create an ArrayList of Characters. Fill the ArrayList with letters from A-Z. Print the ArrayList of all the characters
     */
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            letters.add(i);
        }
        System.out.println(letters);

        ArrayList<Character> letter = new ArrayList<>();

        for (char i = 'Z'; i >= 'A'; i--){
            letter.add(i);
        }
        System.out.println(letter);


        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter firs letter\nAnd last letter");
        System.out.println(listOfChar(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0)));

    }


    public static ArrayList<Character> listOfChar (char a, char z){
        ArrayList <Character> letters = new ArrayList<>();
        for (char i = a; i <= z; i++){
            letters.add(i);
        }
        return letters;
    }

    public static ArrayList<Character> listReversed (char z, char a){

        ArrayList<Character> letter = new ArrayList<>();
        for (char i = z; i >= a; i--) {
            letter.add(i);
        }
        return letter;
    }
}
