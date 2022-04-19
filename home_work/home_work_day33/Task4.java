package home_work_day33;

public class Task4 {
    /*
    Create a method that will accept three numbers. Check if the three
numbers equal to 180.
If they are equal to 180 print: "This is a triangle"
If they are equal to 360 print: "This is a circle"
     */

    public static void threeNumbers (int one, int two, int three){

        if (one+two+three == 180){
            System.out.println("This is a triangle");
        }else if (one+two+three == 360){
            System.out.println("This is a circle");
        }else{
            System.out.println("I don't know what shape is that");
        }

    }

    public static void main(String[] args) {
        threeNumbers(100,200,60);
        threeNumbers(80,50,50);
        threeNumbers(150,50,65);
    }


}
