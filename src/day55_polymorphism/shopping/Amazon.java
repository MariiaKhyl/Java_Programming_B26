package day55_polymorphism.shopping;

public class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b?"Pay for shipping" : "Free shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("returning to Amazon drop location");
    }

    // Amazon is a OnlineShopping
    // Amazon is a Shopping
    // Amazon is a Returning
}
