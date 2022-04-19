package day08_reletional_operators;

public class GiftCard {
    public static void main(String[] args) {

        /*
        Task:
        declare and assign a gift card with 200
        buy 2 items. buy 1 item for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card
         */

        /*double giftCard = 200;
        giftCard *= 2;
        double item1 = 16.25;
        giftCard -= item1;
        System.out.println(giftCard);
        double item2 = 22.33;
        giftCard -= item2;
        System.out.println(giftCard);

         */
        double giftCard = 200;
        System.out.println("Buy item 1 for 100$");
        giftCard -= 150;
        System.out.println("Buy item 2 for 40$ " + giftCard);
        giftCard -= 40;
        System.out.println("Balance - "+ giftCard);


    }
}
