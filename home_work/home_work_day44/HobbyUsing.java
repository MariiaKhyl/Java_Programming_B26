package home_work_day44;

import home_work_day44.Hobby;

import java.util.ArrayList;
import java.util.Arrays;

public class HobbyUsing {
    public static void main(String[] args) {

        Hobby hobbyOne = new Hobby("football",125,false,true);
        Hobby hobbyTwo = new Hobby("Hokey",150.0,false,false);
        Hobby hobbyThree = new Hobby("Ballet",500.1,true,true);
        System.out.println(hobbyOne);
        System.out.println(hobbyTwo);
        System.out.println(hobbyThree);
        ArrayList<Hobby> allHobies = new ArrayList<>();
        allHobies.add(hobbyOne);
        allHobies.add(new Hobby("Soccer", 800.55,true, false));
        System.out.println(allHobies);
        allHobies.add(hobbyTwo);
        allHobies.add(hobbyThree);
        System.out.println(allHobies);

//        ArrayList<Hobby> hobbyArray = new ArrayList<>(Arrays.asList(hobbyThree));
//        System.out.println(hobbyArray);
//        hobbyArray.add(hobbyTwo);
//        hobbyArray.add(hobbyOne);
//        System.out.println(hobbyArray);
        //Hobby [] allHobby = {hobbyOne,hobbyTwo,hobbyThree,null};

       // allHobby [3] = new Hobby("Soccer", 130.55,true, false);
       // System.out.println(Arrays.toString(allHobby));

        ArrayList<Hobby> outdoor = new ArrayList<>(allHobies);
        outdoor.removeIf(each -> each.isOutdoors);
        System.out.println("Inside hobbies");
        System.out.println(outdoor);

        ArrayList<Hobby> otherPeople = new ArrayList<>(allHobies);
        otherPeople.removeIf(each -> !each.requiresOther);
        System.out.println("Requiring other people?");
        System.out.println(otherPeople);

        ArrayList<Hobby> cost = new ArrayList<>(allHobies);
        cost.removeIf(each -> each.annualCost > 500);
        System.out.println("All hobbies that cost less than $500 annually");
        System.out.println(cost);




    }
}
