package day08_reletional_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {

        int h = 5;
        int p = h; // p gets assigned the value of h, which is 5
        h++;// post increment, no other code so it adds 1
        System.out.println("h "+ h);
        System.out.println("p "+ p);
        int k = h++;
        System.out.println(h);
        System.out.println(k);
        int g = ++h;
        System.out.println(h);
        System.out.println(g);
        int e = ++h;
        System.out.println(h);
        System.out.println(e);
        /*int a = 77;
        int v = a;
        ++a;
        System.out.println(a);
        System.out.println(v);
         */


    }

}
