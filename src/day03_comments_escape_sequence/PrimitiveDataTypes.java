package day03_comments_escape_sequence;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //Integer: age, year, salary, miles
        byte _age = 35;
        short $year = 2000;
        int salary = 100000; // preferred
        long miles = 999999999999999999L;
        // We can use only two characters with variables _ and $ in front

        // Decimals: tax, pi
        double tax = 0.26; // preferred
        float pi = 3.14f;

        // symbols : @, #
        char ch1 = '@';
        char ch2 = '#';

        System.out.println(_age);
        System.out.println($year);

        System.out.println("-------------------------------------");

        boolean result1 = true;
        boolean result2 = false;
        boolean result3 = 5 > 10;
        System.out.println(result3);
        System.out.println("-------------------------------------");

        boolean myWork = 5 > 11;
        System.out.println(myWork);
        boolean myWork2 = 12 < 5;
        System.out.println(myWork2);
        boolean myWork3 = 12>5;
        System.out.println(myWork3);
        boolean myWork4 = 55>44;
        System.out.println(myWork4);
        System.out.println("-------------------------------------");

        int a = 100;
        int b = 200;
        boolean aIsGraterThanB = a>b;
        System.out.println(aIsGraterThanB);

        int c = 321;
        int d = 555;
        boolean cd = c<d;
        System.out.println(cd);





    }
}
