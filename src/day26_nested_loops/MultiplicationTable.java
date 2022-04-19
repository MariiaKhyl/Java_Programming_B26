package day26_nested_loops;

public class MultiplicationTable {

    /*
    print the multiplication by the numbers from 1 to 10
    we will see for all numbers 1-10
    1x1=1
    1x2=2
    ..
    3x1
    ..
    10x10

     */

    public static void main(String[] args) {



        for (int j = 1; j <= 10; j++) {

            for (int i = 1; i <= 10; i++) {

                System.out.println(j+" * "+i+" = "+(j * i));


            }
        }
        System.out.println("==========================================");

        //Saim
        /*for (int ii=1; ii<=10;ii++){
            System.out.println(1+" x "+ii +" = "+(1*ii));
        }
        for (int ii=1; ii<=10;ii++){
            System.out.println(2+" x "+ii +" = "+(2*ii));

         */

        for (int num=1; num<=10; num++){

            for (int multi =1 ; multi <=10; multi++){

                System.out.print(num+" x "+multi+" = "+(num*multi)+" | ");

            }

        }





    }}


