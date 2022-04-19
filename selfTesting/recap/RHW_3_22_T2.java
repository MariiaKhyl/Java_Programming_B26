package recap;

public class RHW_3_22_T2 {
    /*
    Make a method that calculate and prints the age
    takes the birth year as an input
     */
    public static void method1 (int yearOfBirth){

        int year = 2022 - yearOfBirth;
        System.out.println(year);

    }

    public static void main(String[] args) {
        method1(1993);
    }

}
