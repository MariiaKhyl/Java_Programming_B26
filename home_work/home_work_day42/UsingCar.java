package home_work_day42;

public class UsingCar {
    public static void main(String[] args) {


        Car honda = new Car();

        honda.model = "Honda";
        honda.year = 2012;
        honda.color = "Silver";
        honda.fuelLevel = 15;

        honda.drive();
        honda.fillTank();

        System.out.println(honda);


    }
}
