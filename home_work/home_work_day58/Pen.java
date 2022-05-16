package home_work_day58;

public class Pen {
    /*
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

     */


        int inkLevel;
        String inkColor;


        public void check(){

            if(inkLevel < 10){
                throw new OutOfInkException("We need to have ink level more or equal to 10");
            }
            System.out.println("Writing with pen, 10 ink used");
            inkLevel-=10;
        }

        public void changeColor(String color) throws InvalidColorException{

            if (color.equals("red") || color.equals("black") || color.equals("blue")){
                throw new InvalidColorException("Invalid color");
            }
            inkColor = color;
        }



}
