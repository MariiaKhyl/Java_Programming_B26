package home_work_day14;

public class Person {

    public static void main(String[] args) {

        /*
        Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

	- The person must be a citizen or a resident
		-> If not print: You must be a citizen or a resident
	- Their age must be between 18 and 35
		-> If not print: Your age must be between 18 to 35 years old
	- They must have a high school diploma
		-> If not print: You must have a high school diploma

	> If all the criteria is met print: You are qualified for the Army
         */

        boolean citizen = false;
        boolean resident = true;
        boolean highSchoolDiploma = true;
        int age = 17;

        if ((citizen || resident) && highSchoolDiploma && (age >= 18 && age <= 35))  {
            System.out.println("1 You are qualified for the Army");

        } else {
            if (!citizen && !resident) {
                System.out.println("You must be a citizen or a resident");
            }
            if (age < 18 || age > 35){
                System.out.println("Your age must be between 18 to 35 years old");
            }
            if (!highSchoolDiploma){
                System.out.println("You must have a high school diploma");
            }


        }



    }

}
