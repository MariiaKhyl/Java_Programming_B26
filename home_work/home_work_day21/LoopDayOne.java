package home_work_day21;

public class LoopDayOne {

    public static void main(String[] args) {

        //write a program that will print all the alphabet letters in lowercase from 'a' to 'z'

        char abc = 'a';
        while (abc <= 'z'){
            System.out.print(abc+" ");
            abc++;
        }
        System.out.println();

        char cba = 'Z';
        while (cba >= 'A'){
            System.out.print(cba+ " ");
            cba--;
        }
        System.out.println();
        char bbb = 'A';
        while (bbb <= 'Z'){
            System.out.print(bbb + " ");
            bbb++;
        }
        System.out.println();
        char ccc= 'z';
        while (ccc>='a'){
            System.out.print(ccc+ " ");
            ccc--;
        }


    }

}
