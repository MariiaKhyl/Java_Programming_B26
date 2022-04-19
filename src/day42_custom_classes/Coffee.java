package day42_custom_classes;

public class Coffee {

    /*
    Create a coffee class with these instance variables:
         price, size(oz), brand, types

    instance methods:

        - make a toString to print all the information of the coffee objects

        - drink: print trying type of coffee

        - refill(amount in oz): print refilling x oz
            add the number of oz to the total size
     */

    double price;
    double size;
    String brand, type;

    public void drink(){
        System.out.println("Drinking " +type+" coffee" );
        size-=1.5;
    }

    public void refill(double amount){
        System.out.println("Refilling " + amount+" oz of coffee");
        size+=amount;
    }
    /*
    public void refill(double size){
        System.out.println("Refilling " + amount+" oz of coffee");
        size+=size; // this updates the local size from the parameter, not the instance size;
    }
     */

    public String toString(){
        return type+" from "+brand+ " size of "+size+ " oz. For total price of "+price;

    }




//    @Override
//    public String toString() {
//        return "Coffee \n" +
//                "price = " + price +
//                ", size = " + size +
//                ", brand = '" + brand + '\'' +
//                ", type = '" + type + '\'';
//    }
}
