package day45_custom_classes;

import java.util.Arrays;

public class UsingFoodObject {
    public static void main(String[] args) {

        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Lays",2);
        System.out.println(chips);
        chips.unitPrice = 1.99;
        chips.calculatePrice();
        System.out.println(chips);
        System.out.println(chips.totalPrice);

        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println("$"+apples.totalPrice);

        String [] strs = {"one","two","three"};

        Food [] allFood = {apples,chips,chicken, null};
        System.out.println(allFood[2]);
        System.out.println(Arrays.toString(allFood));

        allFood[3] = new Food ("Fish",4, 3.55);
        System.out.println(Arrays.toString(allFood));

        // calculate the total price of the shopping list
        System.out.println();
        double totalPriceAll = 0;

        for (Food each : allFood) { // fori = each == allFood[i]
            System.out.println(each);
            totalPriceAll+=each.totalPrice;
        }
        System.out.println(totalPriceAll);


    }
}
