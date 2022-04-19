package day36_methods.day38_array_list;

import java.util.ArrayList;

public class ClassroomTwo {

    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");

        System.out.println(group); //[Ziba]

        group.add(0, "Victor");
        System.out.println(group); // [Victor, Ziba]

        System.out.println(group.get(0)); //Victor
        System.out.println(group.get(1)); // Ziba

        group.add("Ozi");
        System.out.println(group); // [Victor, Ziba, Ozi]

        group.add(1,"Mary");
        System.out.println(group);

        System.out.println(group.add("Emre"));  // returning true
        System.out.println(group);

    }


}
