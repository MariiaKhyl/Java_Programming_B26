package day14_if_statements;

public class Nested_if {

    public static void main(String[] args) {

        boolean a = false;
        boolean b = false;
        boolean c = true;

        if ( a ){  // if a is false b and c will not run . z will be output in console
            System.out.println(1);

            if(b){
                System.out.println(2);
            }
            if (c){
                System.out.println(3);
            }else{
                System.out.println(4);
            }

        }else {
            System.out.println("z");
        }

    }
}
