package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Google Pixel";
        char model = '4';
        String color = "Black";
        double price = 555.55;
        int storage = 64;
        char storageType = 'G';
        boolean withCamera = true;
        char sim = 'A';

        System.out.println("My phone is "+ brand+" "+model+" "+color+" "+price+" "+storage+storageType+" "+withCamera+" "+sim);

        //approach 2 with String variable:

        String fullMessage = "My phone is "+ brand+model+"\n"+color+" "+price+" "+storage+storageType+"\n"+withCamera+" "+sim;
        System.out.println(fullMessage);

    }
}
