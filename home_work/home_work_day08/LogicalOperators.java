package home_work_day08;

public class LogicalOperators {
    public static void main(String[] args) {


        // Logical AND &&
        boolean result1 = 10 > 5 && 10 > 7;
                     //    true  && true  = true
        boolean result2 = 20 > 15 && 20 > 25;
                     //     true  && false = false
        boolean result3 = 30 > 50 && 30 > 10;
                    //       false && true = false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // Logical OR ||
        boolean result4 = 100 == 200 || 100 != 300;
                     //      false   || true = true
        boolean result5 = 1000 > 900 || 1000 < 2000;
                    //       true    || true = true
        boolean result6 = 7 < 0 || 7 > 15;
                    //     false || false = false
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        // Logical NOT !
        boolean result7 = !true;
        boolean result8 = !false;
        System.out.println(result7);
        System.out.println(result8);
        boolean result9 = !(100 == 200);
        System.out.println(result9);






    }
}
