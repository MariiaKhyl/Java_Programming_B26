package home_work_day44;

import java.util.ArrayList;
import java.util.Arrays;

public class RecapUsingFood {

    public static void main(String[] args) {

        RecapFood apple = new RecapFood("Apple");
        System.out.println(apple);
        apple.quantity = 4;
        apple.unitPrice = 1.99;
        apple.calculatePrice();
        System.out.println("Total price "+apple.totalPrice);
        System.out.println(apple);


        RecapFood banana = new RecapFood("Banana", 3);
        System.out.println(banana);
        banana.unitPrice = 0.99;
        banana.calculatePrice();
        System.out.println("Total price "+banana.totalPrice);
        System.out.println(banana);

        RecapFood kiwi = new RecapFood("Kiwi",6, 3.99);
        kiwi.calculatePrice();
        System.out.println("Total price "+kiwi.totalPrice);
        System.out.println(kiwi);

        ArrayList<RecapFood> allFood = new ArrayList<>();
        allFood.addAll(Arrays.asList(apple,banana,kiwi));
        System.out.println(allFood);
        allFood.add(new RecapFood("Juice", 5, 2.99));
        System.out.println(allFood);
        allFood.add(new RecapFood("Honey", 1,12.99));
        System.out.println(allFood);
        allFood.addAll(Arrays.asList(new RecapFood("Gum",2,2.99),
                new RecapFood("Milk", 2, 3.66),
                new RecapFood("Corn",2,5.99)));
        System.out.println(allFood);
        allFood.add(new RecapFood("Hum",2,4.55));
        System.out.println(allFood);
        allFood.add(new RecapFood("Soup",1,5.66));
        System.out.println(allFood);
        allFood.remove(allFood.size()-1);
        System.out.println(allFood);
        allFood.add(new RecapFood("Humus",1, 6.77));
        System.out.println(allFood);

        System.out.println();
        double totalCost = 0;
        for (RecapFood each : allFood) {
            totalCost += each.totalPrice;
        }
        System.out.println("Total cost "+totalCost);

        ArrayList<RecapFood> letterH = new ArrayList<>(allFood);
        letterH.removeIf(each -> each.name.startsWith("H"));
        System.out.println(letterH);

        ArrayList<RecapFood> letterA = new ArrayList<>(allFood);
        letterA.removeIf(each -> each.name.startsWith("A"));
        System.out.println(letterA);

        ArrayList<RecapFood> quantityRemove = new ArrayList<>(allFood);
        quantityRemove.removeIf(each -> each.quantity < 3);
        System.out.println(quantityRemove);

        ArrayList<RecapFood> removePrice = new ArrayList<>(allFood);
        removePrice.removeIf(each -> each.unitPrice < 6);
        System.out.println(removePrice);

        ArrayList<RecapFood> over10 = new ArrayList<>(allFood);
        over10.removeIf(each ->each.unitPrice > 10);
        System.out.println(over10);

    }

}
