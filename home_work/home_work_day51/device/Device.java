package home_work_day51.device;

public class Device {

    String brand, model;
    double price;
    boolean wireless;

//    public Device(String brand, String model, double price, boolean wireless){
//        this.brand = brand;
//        this.model = model;
//        this.price = price;
//        this.wireless = wireless;
//    }

    public void useDevice(){
        System.out.println("Using devise");
    }
    public String toString(){

        return "We bought new device:\nBrand: "+brand+"\nmodel: "+model+"\nprice: "+price+"\nwireless: "+wireless;

    }

}
