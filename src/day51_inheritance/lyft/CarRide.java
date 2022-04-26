package day51_inheritance.lyft;

public class CarRide {
    public static void main(String[] args) {

        Lyft obj1 = new Lyft ("James");

        System.out.println(obj1.calculateTheRates(10));

        LyftXL obj2 = new LyftXL("Mary");
        System.out.println(obj2.calculateTheRates(10));

    }
}
