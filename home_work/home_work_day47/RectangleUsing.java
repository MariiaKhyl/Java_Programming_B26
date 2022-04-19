package home_work_day47;

import home_work_day47.Rectangle;

public class RectangleUsing {
    public static void main(String[] args) {

        Rectangle shape = new Rectangle(33,33);
        System.out.println(shape);

        shape.setLength(12);
        shape.getLength();
        shape.setWidth(11);
        shape.getWidth();
        shape.calculateArea();
        shape.calculatePerimeter();
        System.out.println(shape);

    }
}
