package day07_unary_operators;

public class IncramentExample3 {
    public static void main(String[] args) {

        int i = 5;
        int z = i++;   //int z = i=5; ...i =i+1 = 6;
        System.out.println(i);
        System.out.println(z);
        z = i++;
        System.out.println(z);
        z = i++;
        System.out.println(z);
        System.out.println(i);

        /*
        int i = 5 ; // i = 6
        int z = ++5; // z = 6
         */



        /*int a =10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        int fr = 33;
        int fd = fr++;
        System.out.println(fr);
        System.out.println(fd);

        int c = ++a;
        System.out.println(c);
        System.out.println(a);



        int e = 77;
        int t = e++;
        System.out.println(e);
        System.out.println(t);

         */
    }
}
