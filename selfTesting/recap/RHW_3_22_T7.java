package recap;

public class RHW_3_22_T7 {
    /*
    Create a method that will that accepts three numbers. Check if the three numbers equal to 180.
                If they are equal to 180 print: "This is a triangle"
                If they are equal to 360 print: "This is a circle"
     */

    public static void shapeMethod (double number1, double number2, double number3){

        if (number1+number2+number3 == 180){
            System.out.println("This is a triangle");
        }else if (number1+number2+number3 == 360){
            System.out.println("This is a circle");
        }else{
            System.out.println("This is unknown shape");
        }
    }

    public static void main(String[] args) {
        shapeMethod(15,150.2,35.33);
        shapeMethod(100,50,20.0);
        shapeMethod(300,40,20);
        shapeMethod(44.5,55,88.6);
        shapeMethod(100,50,30);
    }

}
