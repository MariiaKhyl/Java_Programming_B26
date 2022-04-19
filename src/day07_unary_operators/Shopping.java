package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;
        System.out.println(" We pick us 1 water");
        System.out.println("how many items in the cart: "+ ++numberOfItems);
        // preincrement, so the number of items increases right away, then it is printed
        price = price +2.5; // take the price value , wich 0, and add 2,5 , and they reassing to the price variable

        System.out.println("We pick up 2 eggs");
        System.out.println("how many items in the cart: "+ ++numberOfItems);
        System.out.println("how many items in the cart: "+ ++numberOfItems);
        System.out.println(numberOfItems);

        System.out.println(numberOfItems++ + numberOfItems++);
        System.out.println(numberOfItems);


    }
}
