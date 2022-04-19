package day36_methods.day38_array_list;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        System.out.println(group.size());

        group.add("Selo");
        group.add("Alex");
        group.add("Eda");
        group.add("Nav");
        group.add("Mary");
        System.out.println(group);
        System.out.println(group.size());

        System.out.println("First: "+group.get(0));
        System.out.println("Second: "+group.get(1));
        System.out.println("Third: "+group.get(2));
        System.out.println("Forth: "+group.get(3));
        System.out.println("Fifth: "+group.get(4));
        System.out.println();

        for (int i =0; i < group.size();i++){
            System.out.println("Student "+(i+1)+" "+group.get(i));
        }
        System.out.println();

        for (String students : group){ // student == group.get(i);
            System.out.println("Student: "+students);
        }



    }
}
