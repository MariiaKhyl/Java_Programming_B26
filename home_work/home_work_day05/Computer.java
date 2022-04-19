package home_work_day05;

public class Computer {

    public static void main(String[] args) {

        String brand, processor, descriptions, color;
        int ramMemory, storageMemory, numberOfUsbSlots, countOfUsb;
        double cpu ,price;
        boolean monitor , wifiCard;
        monitor = true;
        wifiCard = true;
        char numbersOfMonitor = '2';
        brand = "Dell";
        processor = "Ryzen";
        descriptions = "very powerful";
        color = "Black";
        ramMemory = 64;
        storageMemory = 120;
        price = 999.99;
        numberOfUsbSlots = 1;
        cpu = 2.56;
        countOfUsb = 3;
        System.out.println("I have a computer, type - "+brand+".\nProcessor - "+processor+". \nRam memory - "+ramMemory+" GB and storage memory - "+storageMemory+" GB.\nComputer with the monitor - "+monitor+" and WIFI card - "+wifiCard+"\n"+descriptions+".\nPrice - $"+price+". CPU - "+cpu+".\nColor - "+color+".\nComputer with "+numbersOfMonitor+" monitors. Also, there is "+numberOfUsbSlots+ " USB slots, has "+countOfUsb+" extra USBs.");





    }
}
