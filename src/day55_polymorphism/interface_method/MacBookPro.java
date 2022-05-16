package day55_polymorphism.interface_method;

public class MacBookPro implements Mac{

    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }
}



class Runner{

    public static void main(String[] args) {

        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
//        System.out.println(MacbookPro.NAME);
//        System.out.println(MacbookPro.OS);

        // You can access the static variables from the child class reference, but you should use the interface to access

        Mac.company();
//        Mac.faceTime(); the default method needs to be called from the object

        // Mac.turnOn(); not valid, need an object to call this method

        MacBookPro obj = new MacBookPro();
        obj.turnOn();
        obj.faceTime();

    }

}
