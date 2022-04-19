package test;

public class Abc {

    public static void main(String[] args) {
        char abc='A';
        while (abc<='Z'){
            System.out.print(abc);
            abc++;
        }
        System.out.println();

        char cba='z';
        while (cba>='a'){
            System.out.print(cba);
            cba--;
        }
    }
}
