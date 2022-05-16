package home_work_day58;

public class OutOfInkException extends RuntimeException{

    String parameter;

    public OutOfInkException(String parameter){
        super(parameter);
    }

    /*
    Create a class OutOfInkException
    inherit the RuntimeException class to create an unchecked exception

    create a constructor that accepts a String parameter. Use the String argument to the call the super constructor

Create a class InvalidColorException
    inherit the Exception class to create a checked exception

    create a constructor that accepts a String parameter. Use the String argument to the call the super constructor

Create a class Pen
    create instance variables inkLevel and inkColor

    create an instance method write()

        check if there is enough ink to write and use the pen

            ink should be more than or equal to 10
                if there is not enough ink throw the OutOfInkException

                if there is enough ink:

                    print: "Writing with pen, 10 ink used"
                    subtract 10 from the inkLevel variables

    create an instance method changeColor(String color)

        check if the given parameter of color is either black, red, or blue

            if it is not any of the specified colors throw the InvalidColorException

            if the color is valid assign it to the inkColor variable

    Note: as the creator of this method you should not have a try catch in it

Create a class Runner

    create an object of the Pen and try to call both methods. Handle any Exceptions you need to
     */
}
