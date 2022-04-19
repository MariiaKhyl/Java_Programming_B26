package day48_encapsulation.pizza;

import day48_encapsulation.pizza.Pizza1;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza1 first = new Pizza1("large",3);
        System.out.println(first);

        first.setNumberOfToppings(2);
        System.out.println(first);
        System.out.println(first.getNumberOfToppings());

        Pizza1 second = new Pizza1("",-2);
        System.out.println(second);

        second.setSize("Small");
        second.setNumberOfToppings(1);
        System.out.println(second);



    }
}
