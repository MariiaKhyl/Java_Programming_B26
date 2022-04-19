package home_work_day33;

public class Task3 {
    /*
    create a method that will accept a number. Find and print if it is a
positive number, negative number, or zero
     */
    public static void numbersAccept(int number){

        if (number >=1){
            System.out.println("Number is positive "+number);
        }else if (number < 0){
            System.out.println("Number is negative "+ number);
        }else if (number == 0){
            System.out.println("Number is zero "+ number);
        }else {
            System.out.println("This is not number");
        }

    }

    public static void main(String[] args) {

        numbersAccept(15);
        numbersAccept(0);
        numbersAccept(-11);
        numbersAccept(-2);
        numbersAccept(0);

    }
}
