package day06_03_08_2022;

public class Finra {

    /*
    FINRA

            1. Write a method which prints out the numbers from 1 to 100
            but
                for numbers which are a multiple of 3, print "FIN" instead of the number
                for numbers which are a multiple of 5, print "RA" instead of the number.
                for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,

                    ex:
                        input : 100
                        output:
                            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ..........91 92 FIN 94 RA FIN 97 98 FIN RA

     */

    public static void main(String[] args) {

        String finRa = "1 2";

        for (int i = 3; i <=100; i++ ){

            if( i % 3 == 0 && i % 5 == 0){

                finRa +=" FINRA";

            }else if(i % 3 == 0){

                finRa +=" FIN";

            }else if (i % 5 == 0){

                finRa +=" RA";
            }else
                finRa += " "+ i;


        }
        System.out.println(finRa);



    }

}
