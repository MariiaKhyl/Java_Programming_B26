package day04_variables;

public class Fruits {

    public static void main(String[] args) {

        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have: " + apples);
        System.out.println("This is how many apples we have: " + grapes);
        System.out.println("This is how many apples we have: " + bananas);

        System.out.println("sold some apples");
        apples = 25;
        System.out.println("Apples after selling: " + apples);

        apples = 120;
        System.out.println("I get more apples: " + apples );
        int price = 20;

        System.out.println("The price of my apples " + apples + " apples is $" + price);

    }
}
