package home_work_day42;

public class Rectangle {
    /*
    Create a class Rectangle

create instance variables:
    base, height, perimeter, area
create instance methods:
    - toString(): [return String]
        returns all the information of the Rectangle objects, including the perimeter and area
    - calculatePerimeter(): [void]
        calculate the perimeter and store the result into the perimeter instance variable

        a perimeter of a rectangle is the 4 sides added together

    - calculateArea(): [void]
        calculate the area and store the result into the area instance variable

        an area of a rectangle is the height x width

Create a separate class to create Rectangle objects and test the methods created

     */

    double base, height, perimeter, area;

    @Override
    public String toString() {
        return "InstanceVariable\n" +
                "base - " + base +
                ", height - " + height +
                ", perimeter - " + perimeter +
                ", area - " + area;
    }

    public void calculatePerimeter(){
        perimeter=(base+height)*2;
    }
    public void calculateArea(){
        area=height*base;

    }



}
