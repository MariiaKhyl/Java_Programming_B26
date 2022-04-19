package test;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        /*
        double rate = scanner.nextDouble();
        boolean check = rate >= 5.25 && rate <=7.50;
        System.out.println(check);






        System.out.println("Please enter year");
        int year = scanner.nextInt();
int number=0;
        boolean year1 = false;
        if(year%100==0&&year%400==0){
            year1 =true;
        }
        if(year % 100 !=0&&year%4==0){
            year1 = true;
        }
        System.out.println(year1);



        System.out.println("Please enter response");
        String response = scanner.next();
        boolean accept = false;
        if (response.equalsIgnoreCase("Yes") || response.equalsIgnoreCase("y")){
            accept = true;

        }
        System.out.println(accept);

*/



        System.out.println("Please enter the number");

        double n = scanner.nextDouble();

        if (n>=0.4){
            System.out.println("Large1");
        }else if (n<0.5){
            System.out.println("Small1");
        }else{
            System.out.println("What1");
        }

        if (n>=0.4){
            System.out.println("Large");
            if (n<0.5);
                System.out.println("Small");
        }else{
            System.out.println("What");
        }



/*

        int a = 12;
        int b = 7;
        int c= 28;

        boolean numA = (a >(c- b) / 3);
        boolean numB = (2 * b < a + 2 && (2 * a < c - 2));
        boolean numC = !(a%2<1)||!(c-a<2*b);
        boolean numD = (c/b<(a+2)/b|| c!=a + 2*b && 3*b==c);
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
        System.out.println("numC = " + numC);
        System.out.println("numD = " + numD);



        int z = 10;
        boolean z1 = ((10>7) && (z>=50));
        System.out.println("z1 = " + z1);
        
        z1 = ((z>5)||(z<6));
        System.out.println("z1 = " + z1);


        System.out.println("Enter hours");
        double hours = scanner.nextDouble();
        double priceForOneHour = 2;

        if (hours <= 1){
            System.out.println("You need to pay " + priceForOneHour);
        }else if (hours > 1 && hours < 2){
            priceForOneHour = priceForOneHour * 2;
            System.out.println("You need to pay " + priceForOneHour);
        }else if (hours > 2 && hours < 6){
            priceForOneHour = priceForOneHour * 6; //TODO;
            System.out.println("You need to pay "+ priceForOneHour);
        }else if (hours > 6 && hours < 24){
            priceForOneHour = 20;
            System.out.println("You need to pay "+priceForOneHour);
        }else{
            System.out.println("Invalid entry");
        }
        System.err.println(priceForOneHour);

        */

















    }

}
