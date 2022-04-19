package home_work_day38;

import java.util.ArrayList;

public class ElementsOne {
    /*
    Create an ArrayList of Strings
    add these elements:
	add Hat
	add Shoes
	add Jacket in middle of Hat and Shoes
	add Towel in the beginning
	add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made

     */

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        System.out.println(str.size());

        str.add("Hat");
        str.add("Shoes");
        str.add(1,"Jacket");
        str.add(0,"Towel");
        str.add(1,"Car");

        System.out.println(str);
        System.out.println(str.size());

    }
}
