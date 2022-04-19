package home_work_day38;

import java.util.ArrayList;

public class ElementsTwo {
    /*
    Practice flow:

    Create an ArrayList of Strings, add these elements:
	Iron Man, Spider Man, Thor, Captain America, Hawkeye

	remove Thor by index

	remove Iron Man by element

	remove the first index

    Print the ArrayList after each action to see how the change is made

     */
    public static void main(String[] args) {

        ArrayList<String> avengers = new ArrayList<>();

        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");
        System.out.println(avengers);

        avengers.remove(2);
        System.out.println(avengers);

        avengers.remove("Iron Man");
        System.out.println(avengers);

        avengers.remove(0);
        System.out.println(avengers);


    }
}
