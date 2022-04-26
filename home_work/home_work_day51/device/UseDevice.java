package home_work_day51.device;

public class UseDevice {
    public static void main(String[] args) {

        Device one = new Device();
        one.brand = "IPhone";
        one.model = "XL";
        one.price = 555.55;
        one.wireless = true;
        one.useDevice();
        one.toString();
        System.out.println(one);

        TV two = new TV();
        two.brand = "Sumsung";
        two.model = "Some";
        two.price = 1000;
        two.wireless = false;
        two.useDevice();
        two.toString();
        System.out.println(two);

        Phone three = new Phone();
        three.brand = "Google Pixle";
        three.model = "XL";
        three.price = 600.55;
        three.wireless = true;
        three.useDevice();
        three.toString();
        System.out.println(three);


    }
}
