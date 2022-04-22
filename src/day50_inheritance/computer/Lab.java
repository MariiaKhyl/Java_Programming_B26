package day50_inheritance.computer;

public class Lab {
    public static void main(String[] args) {

        ComputerDay50 obj1 = new ComputerDay50("generic os", 300);
        System.out.println(obj1);

        Windows obj2 = new Windows(500);
        System.out.println(obj2);

        Mac obj3 = new Mac(300);
        System.out.println(obj3);


    }
}
