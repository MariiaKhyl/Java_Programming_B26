package home_work_day50.app;

public class Application {

    private String name, type;
    private double price;

    public Application(String name, String type, double price){
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(double price){
        this.price = price;
    }


}
