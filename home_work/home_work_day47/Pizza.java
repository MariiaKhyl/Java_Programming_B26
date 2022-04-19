package home_work_day47;

public class Pizza {
    /*
    create a class called Pizza
        - data:
            size (String), number of toppings
        - constructor
            - create a constructor that creates a Pizza object with the length and the width

            	call setters here

        - encapsulate the Pizza class
        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost
            - toString()
                print the size, number of toppings, and cost of the pizza
    Create a separate class to create and test the Pizza objects
     */
    private String size;
    private int numberOfToppings;

    //constructor
    public Pizza(String size, int numberOfToppings){
        this.size = size;
        this.numberOfToppings = numberOfToppings;

    }



    public void setSize(String size){
        switch (size.toLowerCase()){
            case "small":
            case "medium":
            case "large":
            this.size = size;
        }
    }
    public void setNumberOfToppings(int numberOfToppings){
        if (numberOfToppings > 0){
            this.numberOfToppings = numberOfToppings;
        }
    }
    public String getSize(){
        return size;
    }
    public int getNumberOfToppings(){
        return numberOfToppings;
    }
    public double calculatePrice(){
        double totalPrice = 0;
        if (size.equalsIgnoreCase("small")){
            totalPrice+=4;
        }else if(size.equalsIgnoreCase("medium")){
            totalPrice+=6;
        }else if (size.equalsIgnoreCase("large")){
            totalPrice+=8;
        }
        totalPrice+=numberOfToppings*0.75;
        return totalPrice;
    }
    public String toString(){
        return "Pizza: \nSize "+size+"\nNumber of toppings "+numberOfToppings+"\nTotal price "+calculatePrice();
    }


}
