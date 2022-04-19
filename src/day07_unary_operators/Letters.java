package day07_unary_operators;

public class Letters {
    public static void main(String[] args) {

        //Task: define a character. Print me four characters on new lines

        /*char letter1 = 'A';
        letter1++;
        System.out.println(letter1);
        letter1++;
        System.out.println(letter1);
        letter1++;
        System.out.println(letter1);
        letter1 = --letter1;
        System.out.println(letter1);
        System.out.println(--letter1);
        System.out.println(--letter1);
         */

        char letter = 'G';
        System.out.println("Original "+ letter++);
        System.out.println("Next four: ");
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(--letter);
        System.out.println(letter--);
        System.out.println(letter);
        System.out.println(letter--);
        System.out.println(letter--);
        System.out.println(letter--);
        System.out.println(letter--);
        System.out.println(letter);

    }
}
