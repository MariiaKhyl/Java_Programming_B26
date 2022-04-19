package day43_custom_classes;

public class CarTask {
    String model, color;
    int year, fuelLevel;

    public void drive(){
        System.out.println("Driving "+model);
        fuelLevel-=5;
    }
    public void fillTank(){
        System.out.println("Filling the tank");
        fuelLevel = 100;
    }
    public boolean isLow(){  return fuelLevel<25;  }

    public String toString(){
        return "Model: "+model+
                "\nYear: "+year+
                "\nColor: "+color+
                "\nFuel Level: "+fuelLevel+"%"+
                "\n"+(isLow()? "Tank is low": "Keep on driving");
    }



}
