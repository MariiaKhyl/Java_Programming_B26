package test;

import java.util.Scanner;

public class SelfTestingLoops {
    public static void main(String[] args) {

       /* for (int i = 1; i <= 4; i++) {

            System.out.println(i);
        }

        int n;
        for (n = 1; n > 4; n++) {
            System.out.println(n);

        }



        for (int n = 4; n> 0 ; n--){
            System.out.println(n);
        }



        for (int n = 4; n < 0; n--) {
            System.out.println(n);
        }

        for (double test = 0; test < 3; test = test + 0.5){
            System.out.println(test);
        }


        for (int count = 0; count <=3; count++){
            for (int count2 = 0; count2 < count; count2++){
                System.out.println(count2);
            }
        }


        for (int i = 0; i <= 10; i++) {

            if(i%2 == 0){
                System.out.println(i);
            }

        }


        String sentence = "One more time";
        for (int i=1; i<=4; i++){
            System.out.println(sentence);
        }



        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result=result*2;
            System.out.println(result);
        }


        for (int n = 1; n <= 3; n++) {
            switch (n){

                case 1:
                    System.out.println("One");
                break;
                case 2:
                    System.out.println("Two");
                break;
                case 3:
                    System.out.println("Three");
                break;
                default:
                    System.out.println("Default case");
            }

        }
        System.out.println("After the loop");


        for (int n = 1; n<= 5; n++){

            if (n == 3)
                break;
            System.out.println("Hello");
        }
        System.out.println("After the loop");


        for (int n=1; n<=5; n++){

            if (n==3)
                System.exit(0);
                System.out.println("Hello");

        }
        System.out.println("After the loop");

        */
        int sum = 0;
        Scanner scanner = new Scanner (System.in);
        while (true){
            int next = scanner.nextInt();
            if (next < 0 )
                break;
            else
                sum = sum+ next;

        }
        System.out.println(sum);




    }
}
