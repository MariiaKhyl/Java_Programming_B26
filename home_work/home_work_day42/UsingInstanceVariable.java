package home_work_day42;

public class UsingInstanceVariable {
    public static void main(String[] args) {

        Rectangle shape1 = new Rectangle();

        shape1.base = 10.12;
        shape1.height = 5.5;
        shape1.calculatePerimeter();
        shape1.calculateArea();
        System.out.println(shape1);

    }
}
