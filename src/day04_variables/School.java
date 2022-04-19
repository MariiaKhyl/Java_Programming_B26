package day04_variables;

public class School {
    public static void main(String[] args) {

        int gradeOne = 35;
        int gradeTwo = 25;
        int gradeThree = 20;
        int gradeFour = 32;
        int gradeFifth = 19;

        int totalStudents = gradeOne + gradeTwo + gradeThree +gradeFour + gradeFifth;
        System.out.println(totalStudents);

        double daysInTheYear = 365.5;
        double snowDay = 55.5;
        double gpaInSchool = 3.5;

        System.out.println("We have " + totalStudents+ " students in our school");
        System.out.println("Also, "+ daysInTheYear + " day in the year we are studing");
        System.out.println("From " +daysInTheYear+ " we have " + snowDay + " of snow day and gpa " + gpaInSchool+ " in the year ");



    }
}
