package home_work_day43;

public class OfferObject {

    public static void main(String[] args) {

        Offer1 offer1 = new Offer1("Cydeo","1513 Hoffman ave.");
        System.out.println(offer1);

        Offer1 offer2 = new Offer1("Cydeo","1513 Hoffman ave.", 120.000);
        System.out.println(offer2);

        Offer1 offer3 = new Offer1("Cydeo","1513 Hoffman ave.",true, 120.000,12);
        System.out.println(offer3);



    }
}
