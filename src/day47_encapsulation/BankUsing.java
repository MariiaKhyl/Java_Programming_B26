package day47_encapsulation;

public class BankUsing {
    public static void main(String[] args) {

        System.out.println(DebitCard.accountType);

        DebitCard object1 = new DebitCard(1234567811113141L, "James", 1000000);
        System.out.println(object1);

        System.out.println();
        DebitCard object2 = new DebitCard(12345671113141L, "Ben", 1000002);
        System.out.println(object2);
        System.out.println(object2.accountType);

        System.out.println();
        DebitCard object3 = new DebitCard(1234141L, "Jerry","Money",7, 10000003);
        System.out.println(object3);


    }
}
