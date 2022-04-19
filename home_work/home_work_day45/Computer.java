package home_work_day45;

public class Computer {
    /*
    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references
     */

    double price;
    String color, brand;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("This is static block run");
        hasScreen = true;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "price= " + price +
                ", color= " + color +
                ", brand= " + brand;
    }
}
