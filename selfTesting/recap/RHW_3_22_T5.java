package recap;

public class RHW_3_22_T5 {
    /*
    create a method that will accept an age and determine if the person is  eligible to vote. Person must be 18 years or older to vote
     */

    public static void ageMethod (int year){

        int yearAge = 2022 - year;

        if (yearAge >= 18){
            System.out.println("Yes you can vote. You are "+yearAge+" years old");
        }else {
            System.out.println("No, you can't vote. You are too yong "+yearAge);
        }

    }

    public static void main(String[] args) {
        ageMethod(1993);
        ageMethod(2000);
        ageMethod(1999);
        ageMethod(2015);
        ageMethod(2018);
        ageMethod(2005);
    }
}

