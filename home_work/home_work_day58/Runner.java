package home_work_day58;

public class Runner {
    public static void main(String[] args) throws InvalidColorException {
        /*
        Create a class Runner

    create an object of the Pen and try to call both methods. Handle any Exceptions you need to
         */

        Pen obj = new Pen();
        obj.inkLevel = 30;
        obj.check();
        System.out.println(obj.inkLevel);
        obj.changeColor("red");
        System.out.println(obj.inkColor);

//        Pen pen = new Pen();
//        pen.check();
//        pen.inkLevel = 40;
//        System.out.println(pen.inkLevel);
//        pen.changeColor("pink");
//        System.out.println(pen);
//        pen.changeColor(pen.inkColor);



    }
}
