package home_work_day24;

public class CreateId {
    public static void main(String[] args) {

        /*
        Create ID [String]

Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8
         */

        String firstName = "John";
        String secondName = "Smith";
        String id = "";


            id += firstName.toLowerCase().charAt(0);

            id +=secondName.substring(0,3);

            id += firstName.length()*2;


        System.out.println("" +id);



    }
}
