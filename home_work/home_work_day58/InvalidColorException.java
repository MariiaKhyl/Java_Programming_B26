package home_work_day58;

public class InvalidColorException extends Exception{
    /*
    Create a class InvalidColorException
    inherit the Exception class to create a checked exception

    create a constructor that accepts a String parameter. Use the String argument to the call the super constructor
     */

    public InvalidColorException(String parameter){
        super(parameter);
    }

}
