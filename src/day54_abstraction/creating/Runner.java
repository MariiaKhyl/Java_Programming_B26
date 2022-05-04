package day54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {

        //Create obj = new Create(); cannot make objects of interfaces;

        Book obj = new Book();
        obj.read();
        obj.write();



    }
}
