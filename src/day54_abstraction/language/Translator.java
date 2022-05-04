package day54_abstraction.language;

public class Translator {
    public static void main(String[] args) {

        //Language obj = new Language();

        Spanish spanish = new Spanish();
        spanish.hi();
        spanish.bye();

        Ukranian ukranian = new Ukranian();
        ukranian.hi();
        ukranian.bye();

        System.out.println(Language.PLANET);

    }
}
