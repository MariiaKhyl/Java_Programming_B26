package day42_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee();

//        coffee1.price = 12.99;
//        coffee1.size = 12;
//        coffee1.brand = "Lavazza";
//        coffee1.type = "Americano";
//        System.out.println(coffee1);

        coffee1.price = 4.99;
        coffee1.size = 16;
        coffee1.brand = "Starbucks";
        coffee1.type = "Latte";

        System.out.println(coffee1);
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.refill(8);
        System.out.println(coffee1);

    }
}
