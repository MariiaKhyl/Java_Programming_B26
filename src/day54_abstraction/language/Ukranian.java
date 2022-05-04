package day54_abstraction.language;

public class Ukranian implements Language{

    @Override
    public void hi() {
        System.out.println("Привіт");
    }

    @Override
    public void bye() {
        System.out.println("До побачення");
    }
}
