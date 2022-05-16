package day55_polymorphism.shopping;

public final class Target extends Shopping{

    public void buyItem(){
        System.out.println("Buying from Target");
    }

    public void returnItem(){
        System.out.println("Returning Item to Target");
    }

}
