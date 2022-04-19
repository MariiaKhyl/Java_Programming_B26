package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char firstNameM = 'M';
        char firstNameA = 'A';
        char firstNameR = 'R';
        char firstNameI = 'I';
        char firstNameI2 = 'I';
        char firstNameA2 = 'A';
        char secondNameK = 'K';
        char secondNameH = 'H';
        char secondNameY = 'Y';
        char secondNameL = 'L';


        System.out.print("My name is " + firstNameM + firstNameA+ firstNameR +firstNameI+firstNameI2+firstNameA2);
        System.out.println(" " + secondNameK + secondNameH + secondNameY + secondNameL);
        System.out.println();

        System.out.println(firstNameM+"\n"+firstNameA+"\n"+firstNameR+"\n"+firstNameI+"\n"+firstNameI2+"\n"+firstNameA2);
        System.out.println();
        System.out.println(secondNameK+"\n"+secondNameH+"\n"+secondNameY+"\n"+secondNameL);

        String name = "" + firstNameM + firstNameA+ firstNameR +firstNameI+firstNameI2+firstNameA2+" "+secondNameK + secondNameH + secondNameY + secondNameL;
        System.out.println("My name is " + name);

    }
}
