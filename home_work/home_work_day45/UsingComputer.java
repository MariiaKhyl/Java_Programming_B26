package home_work_day45;

public class UsingComputer {
    public static void main(String[] args) {

        System.out.println(Computer.hasScreen);
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);

        Computer comp = new Computer(1200.00, "Grey", "HP");
        System.out.println(comp.color);
        System.out.println(comp.brand);
        System.out.println(comp.price);

        System.out.println(comp.hasMemory);
        System.out.println(comp.hasScreen);
        System.out.println(comp.hasBattery);





    }
}
