package day08_reletional_operators;

public class RelationalOp {
    public static void main(String[] args) {
        // Greater than
        boolean result1 = 100 > 90;
        boolean result2 = 200 > 300;
        System.out.println(result1);
        System.out.println(result2);

        // Greater than or equal to:
        boolean result3 = 10 >=9;
        boolean result4 = 100 >= 100;
        System.out.println(result3);
        System.out.println(result4);

        // Less than :
        boolean result5 = 5 < 10; //true if left operator less than right
        boolean result6 = 20< 8;
        System.out.println(result5);
        System.out.println(result6);

        // Less than or equal :
        boolean result7 = 1000 <= 2000;
        boolean result8 = 25 <= 15;
        System.out.println(result7);
        System.out.println(result8);

        // Equal:
        boolean result9 = 10 == 10;
        boolean result10 = 100 == 200;
        System.out.println(result9);
        System.out.println(result10);

        // Not Equal:
        boolean result11 = 1000 != 2000;
        boolean result12 = 1000 != 1000;
        System.out.println(result11);
        System.out.println(result12);




    }
}
