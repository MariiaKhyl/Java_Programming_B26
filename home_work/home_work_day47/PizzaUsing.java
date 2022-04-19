package home_work_day47;

public class PizzaUsing {
    public static void main(String[] args) {

        Pizza order = new Pizza("small", 3);
        System.out.println(order);
        order.calculatePrice();
        order.setSize("medium");
        order.getSize();
        order.setNumberOfToppings(4);
        order.getNumberOfToppings();
        System.out.println(order);



    }
}
