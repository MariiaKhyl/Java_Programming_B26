package day13_if_statements;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TernaryExamples {

    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;
        if (a % 3 == 0){
            evenOrOdd = "Even";
        }else {
            evenOrOdd = "Odd";
        }


        String result = a % 3 == 0 ? "Even" : "Odd";
        System.out.println(evenOrOdd);
        System.out.println(result);

        int num = 4;
        String pasOrNeg;
        if (num > 0){
            pasOrNeg = "positive";
        }else if (num < 0){
            pasOrNeg = "negative";
        }else{
            pasOrNeg = "Zero";
        }
        System.out.println(pasOrNeg);

        String sign = (num > 0) ? "positive" : (num < 0 ) ? "negative" : "zero";
        System.out.println(sign);

        int time = 12;
        double price;
        if ( time >= 10 && time <= 15){
            price = 7.99;
        }else {
            price = 10.99;
        }

        System.out.println(price);

        double ternaryPrice = (time >= 10 && time <= 15) ? 7.99 : 10.99;
        System.out.println(  (true) ? "Hello" : "Bye");

    }

}

