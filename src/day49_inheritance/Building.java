package day49_inheritance;

import day17_18_04_12_13_2022.Student;

public class Building {
    public static void main(String[] args) {

        Person obj = new Person();

        obj.name= "James Bond";
        obj.age = 40;
        obj.favoriteHobby = "spy stuff";
        obj.talk();
        //obj.study() this was a method made in the child class

        StudentSubClass obj2 = new StudentSubClass();
        obj2.name = "Jorge";
        obj2.age = 10;
        obj2.favoriteHobby = "drawing";
        obj2.talk();

        obj2.funLevel = 100;
        obj2.study();

    }
}
