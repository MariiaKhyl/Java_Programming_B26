package home_work_day52.person;

import home_work_day52.person.Chef;
import home_work_day52.person.Tester;

public class Work {
    public static void main(String[] args) {

        Tester obj1 = new Tester();
        obj1.name="Mariia";
        obj1.age = 29;
        obj1.jobTitle= "SDET";
        obj1.salary = 140000;
        System.out.println(obj1);

        obj1.work();
        obj1.hobby();

        Chef obj2 = new Chef();
        obj2.name = "Max";
        obj2.age = 34;
        obj2.jobTitle="QA";
        obj2.salary=160000;
        System.out.println(obj2);
        obj2.work();
        obj2.hobby();


    }
}
