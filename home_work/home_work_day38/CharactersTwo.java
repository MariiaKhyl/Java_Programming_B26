package home_work_day38;

import java.util.ArrayList;

public class CharactersTwo {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Characters. Fill the ArrayList with letters from a-z. Print the ArrayList of all the characters
        Manually remove each vowels and print the new ArrayList
         */

        char first = 'a';
        char last = 'z';
        ArrayList<Character> list = myArrayList(first,last);
        System.out.println(myArrayList(list));

        ArrayList<Character> letters = new ArrayList<>();
        for (char i = 'A'; i < 'Z'; i++) {
            letters.add(i);
        }
        System.out.println(letters);

        letters.remove(letters.indexOf('A'));
        letters.remove(Character.valueOf('O'));
        letters.remove(letters.indexOf('E'));
        letters.remove(Character.valueOf('I'));
        letters.remove(letters.indexOf('U'));
        System.out.println(letters);



    }

    public static ArrayList<Character> myArrayList (char a, char z){

        ArrayList <Character> list = new ArrayList<>();

        for (char i = Character.toLowerCase(a); i < Character.toLowerCase(z); i++) {
            list.add(i);
        }

        return list;
    }

    public static ArrayList<Character> myArrayList (ArrayList<Character> list){

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == 'a' || list.get(i) == 'o' || list.get(i) == 'i' || list.get(i) == 'u' || list.get(i) == 'e'){
                list.remove(i);
            }
        }
        return list;

    }

}
