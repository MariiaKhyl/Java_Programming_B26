package day28_arrays;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        String [] item = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};
        // do we have jackets in stock?

        boolean hasJacket = false;

        for (int i = 0; i< item.length; i++){

               if (item[i].equalsIgnoreCase("jackets")){
                   hasJacket = true;
                   break;
            }

        }
        System.out.println(hasJacket ? "Jackets in stock" : "Jackets out of stock");
/*
        if(hasJacket){
            System.out.println("Jackets in stock");
        }else {
            System.out.println("Jackets out of stock");
        }

 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which item are you looking for");
        String lookingFor = scanner.nextLine();;
        boolean inStock = false;

        for (int i = 0; i < item.length; i++) {

            if (item[i].equalsIgnoreCase(lookingFor)){

                inStock = true;
                break;
            }

        }
        System.out.println(lookingFor+ (inStock ? " in stock" : " out of stock"  ));




    }
}
