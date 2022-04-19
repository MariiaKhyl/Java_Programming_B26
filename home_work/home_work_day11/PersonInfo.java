package home_work_day11;

public class PersonInfo {
    public static void main(String[] args) {

        /*
        Task02:
        Variables(Primitives - Non Primitives), Concatenation and Escape Sequences
        Create class named "PersonInfo" and make a main method

        Create variables and give value related to you:

        -String name
        - byte age
        - char gender
        - boolean student
        - short number of siblings
        - long favorite number
        - int number of seasons in your area
         - double birth date:(month.day)
         - int year
        -String full birthday date with year
        - String favorite quote
        -Print the person information with using concat/escape characters

         */
        String  name = "Mariia Khyl";
        byte age = 29;
        char gender = 'F';
        boolean student = true;
        short numberOfSiblings = 1;
        long favoriteNumber = 12;
        int numberOfSeasonsInYourArea = 4;
        double birthDate = 1.12;
        int year = 1993;
        String fullBirthdayDateWithYear = birthDate+"."+year;
        String favoriteQuote ="Never give up";
        System.out.println("Name - "+name+"\nage - "+age+ "\nFavorite quote - "+favoriteQuote);



    }
}
