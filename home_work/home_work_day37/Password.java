package home_work_day37;

public class Password {

    /*
    Valid Password

	Given a String password find out if it is a valid password

	Requirements:

		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
			! @ # $ % ^ & *
     */
    public static String validPassword (String str){

        int uppercase = 0;
        int lowercase = 0;
        int number = 0;
        int symbols = 0;
        int total = 0;


        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (str.length() >= 8){

                if (Character.isUpperCase(each)){
                    uppercase++;
                }else if (Character.isLowerCase(each)){
                    lowercase++;
                }else if (Character.isDigit(each)){
                    number++;
                }else {
                    symbols++;
                }
            }
            total = uppercase+lowercase+number+symbols;
            if (total >=8 && uppercase >= 1 && lowercase >= 1 && number >= 1 && symbols >= 1){
                return str;
            }

        }
        return "Invalid entry";

    }

    public static void main(String[] args) {
        System.out.println(validPassword("Mariia2022*"));
    }

}
