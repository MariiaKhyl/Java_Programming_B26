package home_work_day08;

public class NotForIntelleJ {

    public static void main(String[] args) {

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int x = 2 + (3 * (2 / 1)) =  8;

what is x?
         */
        int x = 2 + 3 * 2 / 1;
        System.out.println(x);
        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int y = ( 2 + 3 ) * 2 = 10;

what is y?
         */
        int y = ( 2 + 3 ) * 2;
        System.out.println(y);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int w = 78 / (2 * 2) + 3 - 5 % 5 = 81; TODO: wtf

what is z?
         */
        int w = 78 / 2 * 2 + 3 - 5 % 5;
        System.out.println(w);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2; = 17

what is i?
         */
        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
        System.out.println(i);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int a = 8; a =7
int b = a--; b= 8,

what is a?
what is b?
         */

        int a = 8; //a =7
        int b = a--; //b= 8,
        System.out.println(a);
        System.out.println(b);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int a =1    TODO: wtf
int b = -a-- + a++ / -a-- * --a;


what is a?
what is b?
         */
        int a1 =1;
        //int b1 = -a-- + a++ / -a-- * --a;
        int b1 = (-a-- + a++) / (-a-- * --a);
        System.out.println(a1);
        System.out.println(b1);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int A = 50;
int B = --A + A++ + A-- + A++;
        49  + 49  + 50  + 49 = 197


what is A?
what is B?
         */
        int A = 50;
        int B = --A + A++ + A-- + A++;
        System.out.println(A);
        System.out.println(B);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int X = 4; X = 5
int Y = X * 4 - X++;
        4 * 4 - 4; = 12

what is X?
what is Y?

         */
        int X = 4;
        int Y = X * 4 - X++;
        System.out.println(X);
        System.out.println(Y);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int t = 100;
int p = - ++t * -t-- / t++ + --t;
         - 101 * -101 / 100 + 100
             -1  / 201 =
what is t?
what is p?
         */
        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        System.out.println(t);
        System.out.println(p);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int R = 20;
int W = -R-- + -R++ + --R * R-- % 2;
         -20 + -19  + 19  * 19  % 2;
                          -38

what is R?
what is W?
         */
        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        System.out.println(R);
        System.out.println(W);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int M = 300;
int N = 400;
int U = ++M + N++ - M-- % 2 + --N % 2;
         301 + 400- 301 % 2 + 400 % 2
         U = 700
         M = 300
         N = 400

what is M?
what is N?
what is U?
         */
        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + (--N % 2);
        System.out.println(M);
        System.out.println(N);
        System.out.println(U);
    }
}
