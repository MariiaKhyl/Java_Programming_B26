package day48_encapsulation.shape1;

public class UsingSquareShape {
    public static void main(String[] args) {

        SquareShape obj = new SquareShape(5);
        System.out.println(obj);
        obj.setSide(11);
        System.out.println(obj.getSide());
        System.out.println(obj);



    }
}
