package day08_reletional_operators;

public class AgeGroup {

    public static void main(String[] args) {

        /*
        task:
        declare and assign an age variable

        is the person a kid ( up to 13, include 13)
        is the person a senior citizen ( 65 and above)

         */
        /*int age = 45;
        int kid = 14;
        int senior = 65;
        boolean comper = age >=kid;
        boolean comper2 = age == senior;
        boolean comp3 = senior != kid;
        System.out.println(comp3);
        System.out.println(comper);
        System.out.println(comper2);

         */

        int age = 13;
        boolean isKid = age <= 13;
        boolean isSenior = age >= 65;
        System.out.println("You are a kid " + isKid);
        System.out.println("You are a kid "+ isSenior);


    }
}
