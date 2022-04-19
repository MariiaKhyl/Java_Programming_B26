package day09_Scanner;

public class EligibleToVote {
    public static void main(String[] args) {


    /*
    Create and assign there variables:
    name
    are they citizen
    do have criminal background
    age
    determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

     */

    /*String name = "Mariia Khyl";
    boolean areTheyCitizen = true;
    boolean criminalBackground = false;
    int age = 29;
    boolean citizenAndCriminal = areTheyCitizen || criminalBackground;
        System.out.println(citizenAndCriminal);
    boolean age2 = age >= 18;
        System.out.println(age2);

     */



        String name = "James Bond";
        boolean isCitizen = true;
        boolean hasCriminalBackground = true;
        int age = 49;

        boolean isEligibleToVote = age >=18 && isCitizen == true && !hasCriminalBackground;
        System.out.println("James Bond is eligible to vote "+isEligibleToVote);


    }
}
