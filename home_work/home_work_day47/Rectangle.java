package home_work_day47;

public class Rectangle {
    /*
    create a class called Rectangle

        - data:

            length, width

        - constructor

            - create a constructor that creates a Rectangle object with the length and the width

            	call setters here

        - encapsulate the Rectangle class

        	- setter condition: length and width must both be a positive number otherwise they will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Rectangle

            - calculatePerimeter()
  				calculate and return the perimeter of a Rectangle

            - toString()
                print the length, width, area, and perimeter of the Rectangle object

    Create a separate class to create and test the Rectangle objects
     */
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0){
            this.width = width;
        }
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return (length +width)*2;
    }
    public String toString(){
       return "Rectangle information: \nLength " + length + "\nWidth "+width+"\nArea "+calculateArea() +"\nPerimeter "+ calculatePerimeter();


    }



}
