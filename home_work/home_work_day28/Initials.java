package home_work_day28;

public class Initials {
    public static void main(String[] args) {

        /*
        Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
                Ex:
                Input:
        [ “James Bond”, “Eve Rell”, “Anna Johnson” ]
                Output:
                JB, ER, AJ
         */

        String [] names = {"James Bond", "Eve Rell", "Anna Johnson"};
        String result = "";

        for (int i = 0; i < names.length; i++) {

            result = names[i].toUpperCase();

            System.out.println(""+result.charAt(0)+"."+result.charAt(result.indexOf(" ")+1));

        }


    }
}
