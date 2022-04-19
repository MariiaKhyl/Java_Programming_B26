package day06_03_08_2022;

public class EncryptPassword {

    public static void main(String[] args) {

        /*
         Given a string password. Encrypt with "x" a given password and print.
               * password: cydeo
               * encrypt with char :x
               * output:cxyxdxexox
         */

        String password = "cydeo";
        char encrypt = 'x';
        String output = "";

        for (int i=0; i<password.length();i++){

            output+=""+ password.charAt(i)+encrypt;

        }
        System.out.println(output);




    }
}
