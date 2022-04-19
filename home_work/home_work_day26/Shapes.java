package home_work_day26;

public class Shapes {
    public static void main(String[] args) {

        /*
        Print this shape:

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         */

        String star = "* * * * * * * *";

        for (int i=0; i<star.length();i++){

            for (int j=0; j<=i;j++){

                System.out.print(star.charAt(j));
            }
            System.out.println();

        }

        /*
        Print this shape:

         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         */
        System.out.println();

        for (int i = 0; i <8; i ++){

            for (int j = 0; j<9; j++){
                System.out.print(" * ");

            }
            System.out.println();
        }




    }

}
