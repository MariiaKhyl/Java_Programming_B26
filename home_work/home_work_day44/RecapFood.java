package home_work_day44;

import day45_custom_classes.Food;

public class RecapFood {
    /*
    create a class called Food

        - data:

            name, quantity, unit price, total price
   */
    String name;
    int quantity;
    double unitPrice, totalPrice;

    public RecapFood(String name){
        this.name = name;
    }
    public RecapFood(String name, int quantity){
        this(name);
        this.quantity = quantity;
    }
    public RecapFood(String name, int quantity, double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }
    public void calculatePrice(){
        totalPrice=quantity*unitPrice;
    }
    public String toString(){
        String object = name;
        if (quantity!=0){
            object+=" - "+quantity;
        }
        if (unitPrice!=0){
            object+=" - "+unitPrice;
        }
        return object;
    }

   /*
        - constructor

            - create a constructor that creates a day45_custom_classes.Food object with the name

            - create a constructor that creates a Food object with the name and quantity

            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here

        - method:

            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information

    Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20
     */
}
