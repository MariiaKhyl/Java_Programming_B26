package day36_methods.day38_array_list;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.remove(list.size()-1));

        //list.size() -1 --> last index;
        // remove(last index) --> remove element: wood
        // prints the removed element: wood
        System.out.println(list);

        list.remove("sun");
        System.out.println(list);

        System.out.println((list.remove("apple"))); // console - false
        System.out.println(list);

        list.add("light");
        list.add("light");
        System.out.println(list);
        list.remove("light");
        System.out.println(list);


    }
}
