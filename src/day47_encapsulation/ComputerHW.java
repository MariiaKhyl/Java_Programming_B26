package day47_encapsulation;

public class ComputerHW {
    /*
    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

     */

    String brand, color;
    double price;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Static block run");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public ComputerHW(String brand, String color, double price) {
        System.out.println("Constructor run");
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return "ComputerHW: " +
//                "brand - " + brand +
//                ", color - " + color +
//                ", price - " + price;
//    }

}
