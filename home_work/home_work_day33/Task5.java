package home_work_day33;

public class Task5 {
    /*
    create a method that accepts a String and print each character of the
String on a seperate line
     */
    public static void eachCharacter (String characters){

        for (int i = 0; i < characters.length(); i++) {

            System.out.println(characters.charAt(i)+" ");
        }

    }

    public static void main(String[] args) {
        eachCharacter("Mariia");
        eachCharacter("Hello, how you doing");
    }

}
